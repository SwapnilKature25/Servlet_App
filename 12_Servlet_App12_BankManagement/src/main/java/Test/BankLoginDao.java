package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankLoginDao
{
	BankBean bb=null;
	public BankBean retrieve(String un,String pw)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1522:orcl","swapnil","swap25");
			
			PreparedStatement ps = con.prepareStatement
					("select *from BankCustomer where username = ? and password=?");
			
			ps.setString(1, un);
			ps.setString(2, pw);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				bb=new BankBean();
				bb.setFullName(rs.getString(1));
				bb.setEmail(rs.getString(2));
				bb.setUname(rs.getString(3));
				bb.setPass(rs.getString(4));
				bb.setCpass(rs.getString(5));
				bb.setBalance(rs.getDouble(6));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return bb;
	}
}
