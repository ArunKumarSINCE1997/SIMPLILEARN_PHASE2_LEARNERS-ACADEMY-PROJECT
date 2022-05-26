package com.management.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection createConnection() throws ClassNotFoundException {
		String url = "jdbc:mysql://LocalHost:3306/ LEARNERS_ACADEMY?useSSL=false";
		String username = "root";
		String password = "root12345";
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			if(con!= null) {
				//System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
				System.out.println("* * * Connection Established");
				//System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
			}
			
		}catch(SQLException e){System.out.println(e);}
		return con;
		
	}
}