/**
 * 
 */
package com.cvtheque.dao.util;

/**
 * @author aston
 *
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public abstract class AbstractJdbcMapper<T> implements RowMapper<T>, ResultSetExtractor<Set<T>> {

	public AbstractJdbcMapper() {
		super();
	}
	
	
	public Set<T> extractData(ResultSet rs) throws SQLException, DataAccessException {
	    // Cette methode du ResultSetExtractor fait simplement appel a celle du RowMapper qui
	    // devra etre ecrite par les enfants de cette classe.
	    Set<T> resultat = new HashSet<T>();
	    int id = 0;
	    while (rs.next()) {
	      T result = this.mapRow(rs, id);
	      resultat.add(result);
	      id++;
	    }
	    return resultat;
	}

	public abstract T mapRow(ResultSet rs, int id) throws SQLException;

}
