package test.db;

import java.sql.*;
public class DBConnection {
	public static Connection getCon() throws SQLException{
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			con=DriverManager.getConnection(url,"scott","tiger");
			return con;
			
		}catch(ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
			return null;
		}
	}

}
