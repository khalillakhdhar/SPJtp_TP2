package com.orsys.model;

public class User {
	private String username,password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String verif()
	{
		if(this.password.equals("admin"))
			return "hello "+ this.username;
		else
			return "désolé "+ this.username+" le mot de passe et incorrecte";
	}

}
