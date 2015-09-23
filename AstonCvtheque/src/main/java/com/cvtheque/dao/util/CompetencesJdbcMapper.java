/**
 * 
 */
package com.cvtheque.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.cvtheque.entity.CompetencesEntity;
import com.cvtheque.entity.ICompetencesEntity;

/**
 * @author aston
 *
 */
public class CompetencesJdbcMapper extends AbstractJdbcMapper<ICompetencesEntity> {

	/**
	 * 
	 */
	public CompetencesJdbcMapper() {
		super();
	}

	@Override
	public ICompetencesEntity mapRow(ResultSet rs, int id) throws SQLException {
		ICompetencesEntity result = new CompetencesEntity();
	    result.setNoCandidatComp(Integer.valueOf(rs.getInt("nocdt")));
	    result.setCodeComp(Integer.valueOf(rs.getInt("codcomp")));
	    result.setNiveauComp(Integer.valueOf(rs.getInt("nivcomp")));	    
	    return result;
	}

}
