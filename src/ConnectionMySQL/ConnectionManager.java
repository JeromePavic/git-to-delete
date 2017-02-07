package ConnectionMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Class.Poney;
import Class.Jockey;

public class ConnectionManager {
	
	private static String DB_URL = "jdbc:mysql://localhost:3306/hippodrome?useSSL=false";
	private static String DB_USER = "root";
	private static String DB_PASSWORD = "";
	
	private static Connection connection;
	
	private ConnectionManager() {
	}

	
	public static Connection getConnection() {
		if (connection == null) {
			try {
				connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				connection.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
	
	public static void loadDriver() {
		try {
			  Class.forName(com.mysql.jdbc.Driver.class.getName());
			} catch(ClassNotFoundException e) {
			  e.printStackTrace();
			}
	}
}
