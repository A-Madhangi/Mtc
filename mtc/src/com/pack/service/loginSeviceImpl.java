package com.pack.service;

import com.pack.dao.LoginDaoImpl;
import com.pack.model.Login;


public class loginSeviceImpl implements loginService {

	@Override
		
	public boolean checkLogin(Login a) {
		// TODO Auto-generated method stub
		boolean value= new LoginDaoImpl().checkLogin(a);
		return value;
	}

	public int getUsername(Login a) {
		// TODO Auto-generated method stub
		int username= new LoginDaoImpl().getUserName(a);
		return username;
	}

}
