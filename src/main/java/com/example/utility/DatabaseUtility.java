package com.example.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtility {

	public static Class loadDriver(String driver) throws ClassNotFoundException {
		return Class.forName(driver);
	}
	
	public static Connection connectionEstablish(String url, String username, String password) throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
	
	public static PreparedStatement creatrSt(Connection connection, String sql) throws SQLException {
		return connection.prepareStatement(sql);
	}
	
	public static ResultSet generateResultSet(PreparedStatement ps) throws SQLException {
		return ps.executeQuery();
	}
}
