package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pack.JdbcConnection;
import com.pack.model.Login;

public class LoginDaoImpl implements Logindao {

	
     @Override
	public  boolean checkLogin(Login a) {
		// TODO Auto-generated method stub
		Connection con=null;
		boolean val=false;
		try
		{
			System.out.println("ado impl");
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select username,password from login where username=? and password=?");
			ps.setInt(1, a.getUserName());
			ps.setString(2, a.getPassword());
			ResultSet rs=ps.executeQuery();
			System.out.println(rs);
			if(rs.next())
			{
				System.out.println("hello");
				val=true;
			}
			
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
		return val;
	}

	public int getUserName(Login a) {
		// TODO Auto-generated method stub
		return 0;
	}

	


	
	
	
}
