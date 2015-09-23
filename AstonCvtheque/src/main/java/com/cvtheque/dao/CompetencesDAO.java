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
import com.cvtheque.dao.util.CompetencesJdbcMapper;
import com.cvtheque.entity.ICompetencesEntity;


/**
 * @author aston
 *
 */
public class CompetencesDAO extends AbstractDAO<ICompetencesEntity> implements ICompetencesDAO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	public CompetencesDAO() {
		super();
	}

	@Override
	public String getTableName() {
		return "Competences";
	}

	@Override
	public String getPkName() {
		return "nocdt";
	}

	@Override
	public String getAllColumnNames() {
		return "nocdt, codcomp, nivcomp";
	}

	@Override
	public ICompetencesEntity insert(final ICompetencesEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		try {
			PreparedStatementCreator psc = new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection connexion) throws SQLException {
					PreparedStatement ps = connexion.prepareStatement("insert into " + CompetencesDAO.this.getTableName()
					    + " (nocdt, codcomp, nivcomp) values (?,?,?);", Statement.RETURN_GENERATED_KEYS);
					ps.setInt(1, pUneEntite.getNoCandidatComp());
					ps.setInt(2, pUneEntite.getCodeComp());					
					ps.setInt(3, pUneEntite.getNiveauComp());					
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
	public ICompetencesEntity update(ICompetencesEntity uneEntite) throws ExceptionDao {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AbstractJdbcMapper<ICompetencesEntity> getMapper() {
		return new CompetencesJdbcMapper();
	}

}
