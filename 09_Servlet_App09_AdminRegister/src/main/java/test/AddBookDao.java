package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddBookDao {
	
	public int add(BookBean b)
	{
		int k = 0;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl", "swapnil", "swap25");
			
			PreparedStatement ps = con.prepareStatement
					("insert into BookDetail values(?,?,?,?,?)");
			ps.setInt(1, b.getbId());
			ps.setString(2, b.getbName());
			ps.setString(3, b.getbAuthor());
			ps.setInt(4, b.getbPrice());
			ps.setInt(5, b.getbQty());
			
			k = ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}
}
