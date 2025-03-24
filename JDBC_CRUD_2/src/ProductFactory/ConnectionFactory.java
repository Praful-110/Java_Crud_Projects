package ProductFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public static Connection con =null;
	
	static {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_operation","root","root");
			
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
						
					}
			}
	
	public static Connection getConnection() {
		return con;
		
	}
	

}
