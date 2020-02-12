package TLDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class ProcCode {
		public static void callit() {
			int num=12;
		try{
		Connection conn = DBConnection.getConnection();
		CallableStatement cstmt = conn.prepareCall("{?=call IsPar(?)}");
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.setInt(2, num);
		cstmt.executeUpdate();
		String volume = cstmt.getString(1);
		System.out.println(volume);
		}catch(Exception e){ System.out.println(e);}
		} 
}
