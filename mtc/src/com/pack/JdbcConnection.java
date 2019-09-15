package com.pack;

import java.sql.*;

public class JdbcConnection {

	public JdbcConnection() {
		// TODO Auto-generated constructor stub
	}
	public static Connection getConnection()
	{
		 Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}


}
