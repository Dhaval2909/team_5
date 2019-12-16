package in.cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcLoginDb {
	 private static  String driver = "com.mysql.cj.jdbc.Driver";
	  private static  String url= "jdbc:mysql://localhost:3306/test";
	  private static  String username="root";
	  private static  String password="";
	 public static void loginUser(User user)
	 {
		 
		try {    
			    Class.forName(driver);
			    Connection con = DriverManager.getConnection(url,username,password);
			
			    String sql = "INSERT INTO login1(USERNAME,PASSWORD) VALUES(?,?)";
			    PreparedStatement ps = con.prepareStatement(sql);
			    ps.setString(1, user.getUsername());
			    ps.setString(2, user.getPassword());
			    
			    ps.executeUpdate();
			    return;
			    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
		 
	 }
	
	
	
	
	
}
