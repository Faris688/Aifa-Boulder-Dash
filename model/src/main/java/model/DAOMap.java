package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The Class Controller.
 * @author client
 * @author Aifa-Boulder-Dash
 * @version 2021
 */

/**
 * The Class DAOMap.
 *
 */
class DAOMap {

	
	private Connection connection;

	/**
	 * Instantiates a new DAO map.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOMap(final Connection connection) throws SQLException {
		this.connection = connection;
	}

	/**
	 * @param id Map ID from DB
	 * @return Map
	 */
	public Map find(final String code) {
		return null;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	
	/**
	 * Finds the map
	 */
	public Map find(final int id) {
		Map map = new Map();
		
 
		try {
			final String sql = "CALL getMap(?)";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			final ResultSet result = call.getResultSet();
			result.next();
			if(result.first()) {
			map = new Map(result.getObject(1).toString(), (int) result.getObject(2), (int) result.getObject(3), (int) result.getObject(4));
			}return map;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
}
