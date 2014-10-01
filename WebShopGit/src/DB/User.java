package DB;
/*SQL skit*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class User {
<<<<<<< HEAD
	
	private String name;
	private String password;
	
	public User(String name, String password)
	{
		this.name = name;
		this.password = password;
		
		
	}

=======
	public User(){
		try {
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
	            	                                   "user=tester&password=blablabla");
	            System.out.println(conn.getClientInfo());
	        } catch (Exception ex) {
	            // handle the error
	        	System.err.println(ex.getMessage());
	        }
	}
	
>>>>>>> origin/master
}
