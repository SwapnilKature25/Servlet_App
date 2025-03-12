package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AdminDao {
	
	int k;
	public int reg(AdminBean ab)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl", "swapnil", "swap25");
			
			PreparedStatement ps= con.prepareStatement("insert into AdminTable values(?,?,?,?,?,?)");
			ps.setString(1, ab.getName());
			ps.setString(2, ab.getPass());
			ps.setString(3, ab.getfName());
			ps.setString(4, ab.getlName());
			ps.setString(5, ab.getMid());
			ps.setLong(6, ab.getPhno());
			k = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return k;
	}
}
