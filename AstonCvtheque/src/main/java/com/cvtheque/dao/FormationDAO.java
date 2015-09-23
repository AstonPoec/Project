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

import com.cvtheque.dao.AbstractDAO;
import com.cvtheque.dao.IFormationDAO;
import com.cvtheque.dao.ex.ExceptionDao;
import com.cvtheque.dao.util.AbstractJdbcMapper;
import com.cvtheque.dao.util.FormationJdbcMapper;
import com.cvtheque.entity.IFormationEntity;

/**
 * @author aston
 *
 */
public class FormationDAO extends AbstractDAO<IFormationEntity> implements IFormationDAO {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public FormationDAO() {
		super();
	}

	@Override
	public String getTableName() {
		return "candidat";
	}

	@Override
	public String getPkName() {
		return "id";
	}

	@Override
	public String getAllColumnNames() {
		return "codip, datdeb, datfin, ecole, nocdt";
	}
	

	@Override
	protected AbstractJdbcMapper<IFormationEntity> getMapper() {		
		return new FormationJdbcMapper();
	}

	
	public IFormationEntity insert(final IFormationEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		try {
			PreparedStatementCreator psc = new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection connexion) throws SQLException {
					PreparedStatement ps = connexion.prepareStatement("insert into " + FormationDAO.this.getTableName()
					    + " (codip, datdeb, datfin, ecole, nocdt) values (?,?,?,?,?);", Statement.RETURN_GENERATED_KEYS);
					ps.setInt(1, pUneEntite.getCodeDip());
					ps.setDate(2, pUneEntite.getDateDebutDip());					
					ps.setDate(3, pUneEntite.getDateFinDip());
					ps.setString(4, pUneEntite.getEcole());
					ps.setInt(5, pUneEntite.getNoCandidatDip());
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
	

	@Override
	public IFormationEntity update(IFormationEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		if (pUneEntite.getId() == null) {
			throw new ExceptionDao("L'entite n'a pas d'ID");
		}

		return pUneEntite;
	}


}
