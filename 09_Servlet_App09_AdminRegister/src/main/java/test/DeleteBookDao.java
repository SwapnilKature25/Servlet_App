package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.http.HttpServletRequest;

public class DeleteBookDao {
	
	public static int DelBook(HttpServletRequest req)
	{
		int k =0;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1522:orcl", "Swapnil", "swap25");
			
			PreparedStatement ps = con.prepareStatement
					("Delete from BookDetail where bookId = ? ");
			
			ps.setInt(1, Integer.parseInt(req.getParameter("bid")));
			
			k = ps.executeUpdate();
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
		
	}
}
