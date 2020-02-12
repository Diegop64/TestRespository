package TLDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_CONNECTION = "jdbc:oracle:thin:@85.254.218.229:1521:DITF11";
	public static final String DB_USER = "DB_190ADD002";
	public static final String DB_PASSWORD = "DB_190ADD002";

	public static Connection getConnection() {
		Connection dbConnection = null;
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dbConnection;
	}
}