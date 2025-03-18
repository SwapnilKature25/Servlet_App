package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.http.HttpServletRequest;

public class UpdateBookDao {
	
	public int updateBook(HttpServletRequest req)
	{
		int k = 0;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1522:orcl", "Swapnil", "swap25");
			
			PreparedStatement ps = con.prepareStatement
					("Update BookDetail set bookPrice = ? , bookQty =? where bookId = ? ");
			
			ps.setInt(1, Integer.parseInt(req.getParameter("newPrice")));
			ps.setInt(2, Integer.parseInt(req.getParameter("newQty")));
			ps.setInt(3, Integer.parseInt(req.getParameter("bid")));
			
			k = ps.executeUpdate();	
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
	}
}
