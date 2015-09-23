/**
 * 
 */
package com.cvtheque.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.cvtheque.dao.util.AbstractJdbcMapper;
import com.cvtheque.entity.ExperienceEntity;
import com.cvtheque.entity.IExperienceEntity;


/**
 * @author aston
 *
 */
public class ExperienceJdbcMapper extends AbstractJdbcMapper<IExperienceEntity> {

	/**
	 * 
	 */
	public ExperienceJdbcMapper() {
		super();
	}
	
	@Override
	public IExperienceEntity mapRow(ResultSet rs, int id) throws SQLException {
		
		IExperienceEntity result = new ExperienceEntity();
	    result.setDateDebExp(rs.getDate("datedeb"));
	    result.setDateFinExp(rs.getDate("datfin"));
	    result.setPosteExp(rs.getString("poste"));
	    result.setSocieteExp(rs.getString("societe"));
	    result.setNoCandidatExp(Integer.valueOf(rs.getInt("nocdt")));
	    return result;
	}

}
