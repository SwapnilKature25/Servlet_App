package test;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewAllBookDao {
	
	List<BookBean> lst = new ArrayList<>();
	public List<BookBean> viewAllBooks(HttpServletRequest req)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1522:orcl", "Swapnil", "swap25");
			
			PreparedStatement ps = con.prepareStatement
					("Select * from BookDetail");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				/*pw.println("Book Id : "+rs.getInt(1)
						+"\nBook Name : "+rs.getString(2)
						+"\nBook Author : "+rs.getString(3)
						+"\nBook Price : "+rs.getInt(4)
						+"\nBook Qty : "+rs.getInt(5));	*/
				BookBean bb = new BookBean();
				bb.setbId(rs.getInt(1));
				bb.setbName(rs.getString(2));
				bb.setbAuthor(rs.getString(3));
				bb.setbPrice(rs.getInt(4));
				bb.setbQty(rs.getInt(5));
				lst.add(bb);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lst;
	}
}
