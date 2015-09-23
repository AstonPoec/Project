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
import com.cvtheque.dao.util.RecruteurJdbcMapper;
import com.cvtheque.entity.IRecruteurEntity;

/**
 * @author aston
 *
 */
public class RecruteurDAO extends AbstractDAO<IRecruteurEntity> implements IRecruteurDAO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	public RecruteurDAO() {
		super();
	}	

	@Override
	public String getTableName() {
		return "Recruteur";
	}

	@Override
	public String getPkName() {
		return "norec";
	}
		
	
	@Override
	public String getAllColumnNames() {
		return "norec,nomrec,prenrec,adrec,villerec,cpostrec,present";
	}
		
	
	public IRecruteurEntity insert(final IRecruteurEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		try {
			PreparedStatementCreator psc = new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection connexion) throws SQLException {
					PreparedStatement ps = connexion.prepareStatement("insert into " + RecruteurDAO.this.getTableName()
					    + " (norec, nomrec, prenrec, adrec, villerec, cpostrec, present) values (?,?,?,?,?,?,?);", Statement.RETURN_GENERATED_KEYS);
					ps.setInt(1, pUneEntite.getNoRecruteur());
					ps.setString(2, pUneEntite.getNomRecruteur());
					ps.setString(3, pUneEntite.getPrenRecruteur());
					ps.setString(4, pUneEntite.getAdrRecruteur());
					ps.setString(5, pUneEntite.getVilleRecruteur());
					ps.setString(6, pUneEntite.getCodepRecruteur());
					ps.setBlob(7, pUneEntite.getPresentationRecruteur());					
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
	public IRecruteurEntity update(IRecruteurEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		if (pUneEntite.getId() == null) {
			throw new ExceptionDao("L'entite n'a pas d'ID");
		}
		
		
		return pUneEntite;
	}

	@Override
	protected AbstractJdbcMapper<IRecruteurEntity> getMapper() {
		return new RecruteurJdbcMapper();
	}
		
}
