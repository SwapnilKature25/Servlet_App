package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.http.HttpServletRequest;

public class CustomerAdminLoginDao {
	AdminBean cb= null;
	public AdminBean login(String un, String pw)
	{
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("select *from CustomerAdmin where uname = ? AND pword = ?");
			
			ps.setString(1, un);
			ps.setString(2, pw);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				cb = new AdminBean();
				cb.setuName(rs.getString(1));
				cb.setpWord(rs.getString(2));
				cb.setfName(rs.getString(3));
				cb.setlName(rs.getString(4));
				cb.setCity(rs.getString(5));
				cb.setmId(rs.getString(6));
				cb.setPhNo(rs.getLong(7));				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return cb;
	}

}

