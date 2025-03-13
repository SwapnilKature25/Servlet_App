package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.http.HttpServletRequest;

public class LoginDao {
	AdminBean ab = null;
	
	public AdminBean login(HttpServletRequest req)
//	public int login(AdminBean ab)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1522:orcl", "Swapnil","swap25");
			
			PreparedStatement ps = con.prepareStatement
					("select *from AdminTable where adminname = ? and adminpassword = ?");
			
//			ps.setString(1, ab.getName());
//			ps.setString(2, ab.getPass());
			ps.setString(1, req.getParameter("adname"));
			ps.setString(2, req.getParameter("adpass"));
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				ab = new AdminBean();
				ab.setName(rs.getString(1));
				ab.setPass(rs.getString(2));
				ab.setfName(rs.getString(3));
				ab.setlName(rs.getString(4));
				ab.setMid(rs.getString(5));
				ab.setPhno(rs.getLong(6));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ab;
	}
}
