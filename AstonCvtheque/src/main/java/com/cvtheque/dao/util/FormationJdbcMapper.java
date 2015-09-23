/**
 * 
 */
package com.cvtheque.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.cvtheque.dao.util.AbstractJdbcMapper;
import com.cvtheque.entity.FormationEntity;
import com.cvtheque.entity.IFormationEntity;


/**
 * @author aston
 *
 */
public class FormationJdbcMapper extends AbstractJdbcMapper<IFormationEntity> {

	/**
	 * 
	 */
	public FormationJdbcMapper() {
		super();
	}
	
	@Override
	public IFormationEntity mapRow(ResultSet rs, int id) throws SQLException {
		
		IFormationEntity result = new FormationEntity();
	    result.setCodeDip(Integer.valueOf(rs.getInt("codip")));
	    result.setDateDebutDip(rs.getDate("datdeb"));
	    result.setDateFinDip(rs.getDate("datfin"));
	    result.setEcole(rs.getString("ecole"));
	    result.setNoCandidatDip(Integer.valueOf(rs.getString("nocdt")));
	    return result;
	}

}
