/**
 * 
 */
package com.cvtheque.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.cvtheque.entity.IRecruteurEntity;
import com.cvtheque.entity.RecruteurEntity;

/**
 * @author aston
 *
 */
public class RecruteurJdbcMapper extends AbstractJdbcMapper<IRecruteurEntity> {

	/**
	 * 
	 */
	public RecruteurJdbcMapper() {
		super();
	}

	@Override
	public IRecruteurEntity mapRow(ResultSet rs, int id) throws SQLException {		
		IRecruteurEntity result = new RecruteurEntity();
	    result.setNoRecruteur(rs.getInt("norec"));
	    result.setNomRecruteur(rs.getString("nomrec"));
	    result.setPrenRecruteur(rs.getString("prenrec"));
	    result.setAdrRecruteur(rs.getString("adrec"));
	    result.setVilleRecruteur(rs.getString("villerec"));
	    result.setCodepRecruteur(rs.getString("cpostcd"));
	    result.setPresentationRecruteur(rs.getBlob("present"));	    
	    return result;
	}

}
