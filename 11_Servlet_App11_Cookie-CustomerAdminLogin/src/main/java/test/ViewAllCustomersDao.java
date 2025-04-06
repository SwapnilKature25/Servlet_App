package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewAllCustomersDao {
	public ArrayList<CustomerBean> al = new ArrayList<CustomerBean>();
	public ArrayList<CustomerBean> retrieve()
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from Customer71");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				CustomerBean cb=new CustomerBean();
				cb.setPhNo(rs.getLong(1));
				cb.setName(rs.getString(2));
				cb.setCity(rs.getString(3));
				cb.setMid(rs.getString(4));
				al.add(cb);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}
		
}

