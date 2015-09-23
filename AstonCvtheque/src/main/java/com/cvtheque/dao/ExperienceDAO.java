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
import com.cvtheque.dao.IExperienceDAO;
import com.cvtheque.dao.ex.ExceptionDao;
import com.cvtheque.dao.util.AbstractJdbcMapper;
import com.cvtheque.dao.util.ExperienceJdbcMapper;
import com.cvtheque.entity.IExperienceEntity;

/**
 * @author aston
 *
 */
public class ExperienceDAO extends AbstractDAO<IExperienceEntity> implements IExperienceDAO {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ExperienceDAO() {
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
		return "datedeb, datfin, poste, societe, nocdt";
	}
	

	@Override
	protected AbstractJdbcMapper<IExperienceEntity> getMapper() {		
		return new ExperienceJdbcMapper();
	}

	
	public IExperienceEntity insert(final IExperienceEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		try {
			PreparedStatementCreator psc = new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection connexion) throws SQLException {
					PreparedStatement ps = connexion.prepareStatement("insert into " + ExperienceDAO.this.getTableName()
					    + " (datedeb, datfin, poste, societe, nocdt) "
					    + "values (?,?,?,?,?);", Statement.RETURN_GENERATED_KEYS);
					ps.setDate(1, pUneEntite.getDateDebExp());
					ps.setDate(2, pUneEntite.getDateFinExp());					
					ps.setString(3, pUneEntite.getPosteExp());
					ps.setString(4, pUneEntite.getSocieteExp());
					ps.setInt(5, pUneEntite.getNoCandidatExp());
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
	public IExperienceEntity update(IExperienceEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		if (pUneEntite.getId() == null) {
			throw new ExceptionDao("L'entite n'a pas d'ID");
		}

		return pUneEntite;
	}


}
