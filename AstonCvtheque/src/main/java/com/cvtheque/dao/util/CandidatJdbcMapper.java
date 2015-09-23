/**
 * 
 */
package com.cvtheque.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.cvtheque.dao.util.AbstractJdbcMapper;
import com.cvtheque.entity.CandidatEntity;
import com.cvtheque.entity.ICandidatEntity;


/**
 * @author aston
 *
 */
public class CandidatJdbcMapper extends AbstractJdbcMapper<ICandidatEntity> {

	/**
	 * 
	 */
	public CandidatJdbcMapper() {
		super();
	}
	
	@Override
	public ICandidatEntity mapRow(ResultSet rs, int id) throws SQLException {
		
		ICandidatEntity result = new CandidatEntity();
	    result.setNoCandidat(Integer.valueOf(rs.getInt("nocdt")));
	    result.setNomCandidat(rs.getString("nomcd"));
	    result.setPrenCandidat(rs.getString("prencd"));
	    result.setDatnCandidat(rs.getDate("datncd"));
	    result.setVilleCandidat(rs.getString("villecd"));
	    result.setCodepCandidat(rs.getString("cpostcd"));
	    result.setDepCandidat(rs.getString("deptcd"));
	    result.setDateInscription(rs.getDate("datinsc"));
	    result.setEtapeEnreg(Integer.valueOf(rs.getInt("etape")));
	    result.setVehicule(Integer.valueOf(rs.getInt("vehic")));
	    return result;
	}

}
