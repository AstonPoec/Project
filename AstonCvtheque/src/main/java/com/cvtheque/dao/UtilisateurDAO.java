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
import com.cvtheque.dao.util.UtilisateurJdbcMapper;
import com.cvtheque.entity.IUtilisateurEntity;

/**
 * @author aston
 *
 */
public class UtilisateurDAO extends AbstractDAO<IUtilisateurEntity> implements IUtilisateurDAO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	public UtilisateurDAO() {
		super();
	}
	
	@Override
	public String getTableName() {
		return "utilisateur";
	}
	
	@Override
	public String getPkName() {
		return "nousr";
	}

	@Override
	public String getAllColumnNames() {
		return "nousr,login,passwd,datcre,typusr,nocdt";
	}

	@Override
	public IUtilisateurEntity insert(final IUtilisateurEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		try {
			PreparedStatementCreator psc = new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection connexion) throws SQLException {
					PreparedStatement ps = connexion.prepareStatement("insert into " + UtilisateurDAO.this.getTableName()
					    + " (nousr, login, passwd, datcre, typusr, nocdt, norec) values (?,?,?,?,?,?,?);", Statement.RETURN_GENERATED_KEYS);
					ps.setInt(1, Integer.valueOf(pUneEntite.getNoUser()));
					ps.setString(2, pUneEntite.getLogin());					
					ps.setString(3, pUneEntite.getPaswd());
					ps.setDate(4, pUneEntite.getDateCreation());
					ps.setInt(5, Integer.valueOf(pUneEntite.getTypeUser()));
					ps.setInt(6, Integer.valueOf(pUneEntite.getIdUtilisateur()));							
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
	public IUtilisateurEntity update(IUtilisateurEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		if (pUneEntite.getId() == null) {
			throw new ExceptionDao("L'entite n'a pas d'ID");
		}

		return pUneEntite;
	}

	@Override
	protected AbstractJdbcMapper<IUtilisateurEntity> getMapper() {
		return new UtilisateurJdbcMapper();
	}	

}
