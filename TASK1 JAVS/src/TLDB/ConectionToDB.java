package TLDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class ConectionToDB {


	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS WHERE DNI='2222222k'");
		
		int numColumns = rs.getMetaData().getColumnCount();
		while(rs.next()) {
			
			for (int i = 1; i < numColumns+1; i++) {
				System.out.print(rs.getString(i) + "\t\t");
			}
			System.out.println();
		}
		ProcCode.callit(); //For -5-
	}
}