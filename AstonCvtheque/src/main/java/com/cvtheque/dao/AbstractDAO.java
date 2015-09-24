/**
 * 
 */
package com.cvtheque.dao;


import java.io.Serializable;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.cvtheque.dao.ex.ExceptionDao;
import com.cvtheque.dao.util.AbstractJdbcMapper;
import com.cvtheque.entity.IEntity;


/**
 * DAO standard.
 *
 * @param <T>
 *            la cible du DAO
 */

@Repository("abstractDAO")
public abstract class AbstractDAO<T extends IEntity> implements Serializable,IDAO<T> {

	private static final long serialVersionUID = 1L;
	
	private JdbcTemplate objJdbcTemp;
	protected Log LOG = LogFactory.getLog(this.getClass());

	
	/**
	 * @return the objJdbcTemp
	 */
	public JdbcTemplate getObjJdbcTemp() {
		return objJdbcTemp;
	}

	/**
	 * @param objJdbcTemp the objJdbcTemp to set
	 */
	@Autowired
	public void setObjJdbcTemp(JdbcTemplate objJdbcTemp) {
		this.objJdbcTemp = objJdbcTemp;
	}
	
	
	/**
	 * Constructeur de l'objet.
	 */
	public AbstractDAO() {
		super();
	}

	public abstract String getTableName();

	public abstract String getPkName();

	public abstract String getAllColumnNames();

	public abstract T insert(T uneEntite) throws ExceptionDao;

	public abstract T update(T uneEntite) throws ExceptionDao;	

	public boolean delete(T pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return false;
		}
		if (pUneEntite.getId() == null) {
			throw new ExceptionDao("L'entite n'a pas d'ID");
		}
		try {
			return this.getObjJdbcTemp().update("delete from " + this.getTableName() + " where " + this.getPkName() + "=?;",
			    pUneEntite.getId()) > 0;
		} catch (DataAccessException e) {
			throw new ExceptionDao(e);
		}
	}
	
	
	protected abstract AbstractJdbcMapper<T> getMapper();

	
	public T select(Object pUneClef) throws ExceptionDao {
		if (pUneClef == null) {
			return null;
		}
		
		T result = null;
		
		try {
			
			if (pUneClef instanceof Number) {				
				result = (T) this.getObjJdbcTemp().queryForObject("select " + getAllColumnNames() + " from " + this.getTableName()
					   + "  where " + this.getPkName() + "=?;", this.getMapper(),
						((Number)pUneClef).intValue());
			} else {
				result = (T) this.getObjJdbcTemp().queryForObject("select " + getAllColumnNames() + " from " + this.getTableName()
				   + "  where " + this.getPkName() + "=?;", this.getMapper(),
					Integer.valueOf(pUneClef.toString()).intValue());
			}

		} catch (Throwable e) {
			throw new ExceptionDao(e);
		} 
		return result;
	}


	public Set<T> selectAll(String pAWhere, String pAnOrderBy) throws ExceptionDao {
		
		Set<T> result = new HashSet<T>();

		try {

			StringBuffer request = new StringBuffer();
			request.append("select ").append(this.getAllColumnNames())
			.append(" from ");
			request.append(this.getTableName());
			if (pAWhere != null) {
				request.append(" where ");
				request.append(pAWhere);
			}
			if (pAnOrderBy != null) {
				request.append(" order by ");
				request.append(pAnOrderBy);
			}
			request.append(';');
			if (this.LOG.isDebugEnabled()) {
				this.LOG.debug("Requete: " + request.toString());
			}
			
			result = getObjJdbcTemp().query(request.toString(), (ResultSetExtractor<Set<T>>)getMapper());
						

		} catch (Throwable e) {
			throw new ExceptionDao(e);
		} 
		return result;
	}	

	
	/**
	 * Place les elements dans la requete.
	 *
	 * @param ps
	 *            la requete
	 * @param gaps
	 *            les elements
	 * @throws SQLException
	 *             si un des elements ne rentre pas
	 */
	protected void setPrepareStatement(PreparedStatement ps, List<Object> gaps)
			throws SQLException {
		Iterator<Object> iter = gaps.iterator();
		int id = 0;
		while (iter.hasNext()) {
			id++;
			Object lE = iter.next();
			if (lE == null) {
				continue;
			}
			if (lE instanceof String) {
				ps.setString(id, (String) lE);
			} else if (lE instanceof Date) {
				ps.setDate(id, (Date) lE);
			} else if (lE instanceof java.util.Date) {
				ps.setDate(id, new Date(((java.util.Date) lE).getTime()));
			} else if (lE instanceof Timestamp) {
				ps.setTimestamp(id, (Timestamp) lE);
			} else if (lE instanceof Integer) {
				ps.setInt(id, ((Integer) lE).intValue());
			} else if (lE instanceof Double) {
				ps.setDouble(id, ((Double) lE).doubleValue());
			} else {
				throw new SQLException("Invalid type '"
						+ lE.getClass().getSimpleName() + "'");
			}

		}
	}
	
}
