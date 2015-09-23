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
import com.cvtheque.dao.ICandidatDAO;
import com.cvtheque.dao.ex.ExceptionDao;
import com.cvtheque.dao.util.AbstractJdbcMapper;
import com.cvtheque.dao.util.CandidatJdbcMapper;
import com.cvtheque.entity.ICandidatEntity;

/**
 * @author aston
 *
 */
public class CandidatDAO extends AbstractDAO<ICandidatEntity> implements ICandidatDAO {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public CandidatDAO() {
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
		return "nocdt,nomcd,prencd,datncd,adrcd,villecd,cpostcd,deptcd,datinsc,etape,photo,cvitae,vehic";
	}
	

	@Override
	protected AbstractJdbcMapper<ICandidatEntity> getMapper() {		
		return new CandidatJdbcMapper();
	}

	
	public ICandidatEntity insert(final ICandidatEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		try {
			PreparedStatementCreator psc = new PreparedStatementCreator() {
				public PreparedStatement createPreparedStatement(Connection connexion) throws SQLException {
					PreparedStatement ps = connexion.prepareStatement("insert into " + CandidatDAO.this.getTableName()
					    + " (nomcd, prencd, datncd, adrcd, villecd, cpostcd, deptcd, datinsc, etape, vehic) values (?,?,?,?,?,?,?,?,?,?);", Statement.RETURN_GENERATED_KEYS);
					ps.setString(1, pUneEntite.getNomCandidat());
					ps.setString(2, pUneEntite.getNomCandidat());					
					ps.setDate(3, pUneEntite.getDatnCandidat());
					ps.setString(4, pUneEntite.getAdrCandidat());
					ps.setString(5, pUneEntite.getVilleCandidat());
					ps.setString(6, pUneEntite.getCodepCandidat());
					ps.setString(7, pUneEntite.getDepCandidat());
					ps.setDate(8, pUneEntite.getDateInscription());
					ps.setInt(9, pUneEntite.getEtapeEnreg());
					ps.setInt(10, pUneEntite.getVehicule());
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
	public ICandidatEntity update(ICandidatEntity pUneEntite) throws ExceptionDao {
		if (pUneEntite == null) {
			return null;
		}
		if (pUneEntite.getId() == null) {
			throw new ExceptionDao("L'entite n'a pas d'ID");
		}

		return pUneEntite;
	}


}
