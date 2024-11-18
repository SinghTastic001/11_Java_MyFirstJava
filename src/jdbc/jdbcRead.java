package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcRead {
	
	private static final String url = "jdbc:mysql://localhost:3306/student";
	private static final String username = "root";
	private static final String password = "";
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		Statement statement;
		ResultSet result;
		String query = "select * from details";
		
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
			statement = conn.createStatement();
			result = statement.executeQuery(query);
			while(result.next()) {
				System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3));
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			conn.close();
		}
		
	}

}
