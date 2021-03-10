import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author SriL3kh@ and G0v@rdhan
 *
 */

public class Connect 
{ 
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		
		static final String DB_URL = "jdbc:mysql://localhost:3306/bookstoredb";
		
		
	

	    public static String success="database_cnt_error.Proceeding in Offline Mode";
	   
	 
		
		static final String USER = "root";
		static final String PASS = "Password";
	   
	    public static void main(String[] args) 
	    {
	    	Connection conn = null;
	    	try 
	    	{
	    		Class.forName("com.mysql.jdbc.Driver");
	    		System.out.println("Connecting to database...");
	    		conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    		success="Connected to database successfully";//used for offline mode detection
	    		System.out.println("Connected to database successfully...");	    	
                }
	    	catch(SQLException se)
	    	{
	    		se.printStackTrace();
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    	finally 
	    	{
	    		try  
	    		{
	    			if(conn!=null)
	    			conn.close(); 
	    		}
	    		catch(SQLException se)
	    		{
	    			se.printStackTrace();
	    		}
	    	}
	    }
}
