/**
 * 
 */
package com.cvtheque.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.cvtheque.entity.ITableEntity;
import com.cvtheque.entity.TableEntity;


/**
 * @author aston
 *
 */
public class TableJdbcMapper extends AbstractJdbcMapper<ITableEntity> {

	/**
	 * 
	 */
	public TableJdbcMapper() {
		super();
	}
	
	
	public ITableEntity mapRow(ResultSet rs, int id) throws SQLException {		
		ITableEntity result = new TableEntity();
	    result.setCodeTable(Integer.valueOf(rs.getInt("codtbl")));
	    result.setCodeElement(Integer.valueOf(rs.getInt("tblcod")));
	    result.setLibelleElement(rs.getString("libcode"));	    
	    return result;
	}

}
