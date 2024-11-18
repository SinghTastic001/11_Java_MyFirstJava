package jdbc;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcInsert {

	
	private static final String url = "jdbc:mysql://localhost:3306/student";
	private static final String username = "root";
	private static final String password = "";
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	
	public static void main(String[] args) {
		
		String name= "shubhi";
		String surname = "Singh";
		Connection conn = null;
		PreparedStatement statement;
		
		ResultSet result;
		String query = "insert into details(name,surname) values(?,?)";
		
		
		
	}
}
