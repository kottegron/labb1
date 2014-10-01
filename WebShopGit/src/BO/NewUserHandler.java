package BO;

public class NewUserHandler {
	
	public NewUserHandler()
	{
		System.out.println("kontruktor");
		
	}
	
	public void createUser(String name,String password)
	{
		
	System.out.println("creating user" + name + "in handler");
	NewUser NU = new NewUser(name,password);
	NU.create();
	
	
	}
	

}
