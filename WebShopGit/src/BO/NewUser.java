package BO;

import DB.User;

public class NewUser {
	private String name;
	private String password;
	
	public NewUser(String name,String password)
	{
		this.name = name;
		this.password = password;
	}
	
	public void create()
	{
		User U = new User(name,password);
	}

}
