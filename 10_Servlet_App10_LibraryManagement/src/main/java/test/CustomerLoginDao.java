package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.http.HttpServletRequest;

public class CustomerLoginDao {
	CustomerBean cb= null;
	public CustomerBean login(HttpServletRequest req)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1522:orcl","Swapnil","swap25");
			
			PreparedStatement ps = con.prepareStatement
					("select *from Customer where custId = ? AND custName = ?");
			
			ps.setString(1, req.getParameter("cid"));
			ps.setString(2, req.getParameter("cname"));
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				cb = new CustomerBean();
				cb.setCustId(rs.getString(1));
				cb.setName(rs.getString(2));
				cb.setDob(rs.getString(3));
				cb.setGen(rs.getString(4));
				cb.setAddress(rs.getString(5));
				cb.setNumber(rs.getLong(6));
				cb.setEmail(rs.getString(7));				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return cb;
	}

}