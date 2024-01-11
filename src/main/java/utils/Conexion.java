package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	public static Connection getConexion() {
		Connection conn = null;
		final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://127.0.0.1/banco";
		final String USER = "root";
		final String PASS = "rootpassword";
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		return conn;
	}
}


