/**
 * 
 */
package com.cvtheque.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.cvtheque.entity.IUtilisateurEntity;
import com.cvtheque.entity.UtilisateurEntity;

/**
 * @author aston
 *
 */
public class UtilisateurJdbcMapper extends AbstractJdbcMapper<IUtilisateurEntity> {

	/**
	 * 
	 */
	public UtilisateurJdbcMapper() {
		super();
	}
	
	@Override
	public IUtilisateurEntity mapRow(ResultSet rs, int id) throws SQLException {		
		IUtilisateurEntity result = new UtilisateurEntity();
	    result.setNoUser(rs.getInt("nousr"));
	    result.setLogin(rs.getString("login"));
	    result.setPaswd(rs.getString("passwd"));
	    result.setDateCreation(rs.getDate("datcre"));
	    result.setTypeUser(rs.getInt("typusr"));
	    result.setId(rs.getInt("nocdt"));	    
	    return result;
	}

}
