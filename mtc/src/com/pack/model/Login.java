package com.pack.model;

public class Login {
private int userName;
private String password;
public int getUserName() {
	return userName;
}
public void setUserName(int userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public Login(int userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}

}
