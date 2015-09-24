/**
 * 
 */
package com.cvtheque.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.cvtheque.dao.ex.ExceptionDao;
import com.cvtheque.dao.util.AbstractJdbcMapper;
import com.cvtheque.dao.util.TableJdbcMapper;
import com.cvtheque.entity.ITableEntity;


/**
 * @author aston
 *
 */
public class TableDAO extends AbstractDAO<ITableEntity> implements ITableDAO {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public TableDAO() {
		super();
	}
	
	
	public String getTableName() {                                       
		return "tabtable";
	}
	
	
	public String getPkName() {
		return "codtbl";
	}

	
	public String getAllColumnNames() {
		return "codtbl,tblcod,libcode";
	}

	
	public ITableEntity insert(final ITableEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		try {
			PreparedStatementCreator psc = new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection connexion) throws SQLException {
					PreparedStatement ps = connexion.prepareStatement("insert into " + TableDAO.this.getTableName()
					    + " (codtbl, tblcod, libcode) values (?,?,?);", Statement.RETURN_GENERATED_KEYS);
					ps.setInt(1, Integer.valueOf(pUneEntite.getCodeTable()));
					ps.setInt(2, pUneEntite.getCodeElement());					
					ps.setString(3, pUneEntite.getLibelleElement());						
					return ps;
				}
			};
			KeyHolder kh = new GeneratedKeyHolder();
			this.getObjJdbcTemp().update(psc, kh);
			pUneEntite.setId(Integer.valueOf(kh.getKey().intValue()));
		} catch (Throwable e) {
			throw new ExceptionDao(e);
		}

		return pUneEntite;
	}

	
	public ITableEntity update(ITableEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		if (Integer.valueOf(pUneEntite.getCodeTable()) == null) {
			throw new ExceptionDao("L'entite n'a pas d'ID");
		}

		return pUneEntite;
	}


	@Override
	protected AbstractJdbcMapper<ITableEntity> getMapper() {
		return new TableJdbcMapper();
	}
	

}
