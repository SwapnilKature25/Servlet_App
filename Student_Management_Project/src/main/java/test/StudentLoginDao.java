package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.http.HttpServletRequest;

public class StudentLoginDao {
	StudentBean sb = null;
	public StudentBean login(HttpServletRequest req)
	{
		Connection con=null;
		try
		{
			Class.forName(DBInfo.driver);
			con = DriverManager.getConnection(DBInfo.dbURL, DBInfo.dbUName, DBInfo.dbPWord);
			
			PreparedStatement ps = con.prepareStatement
					("select * from Student where rollno=?");
		
			PreparedStatement ps2 = con.prepareStatement
					("select * from Marks where rollno=?");
		
			ps.setString(1, req.getParameter("rno"));
			ps2.setString(1, req.getParameter("rno"));
			ResultSet rs = ps.executeQuery();
			ResultSet rs2 = ps2.executeQuery();
			if(rs.next() && rs2.next())
			{
				sb = new StudentBean();
				sb.setRollNo(rs.getString(1));
				sb.setName(rs.getString(2));
				sb.setCourse(rs.getString(3));
				sb.setTotMarks(rs.getInt(4));
				sb.setPer(rs.getFloat(5));
				sb.setResult(rs.getString(6));
				
				sb.getMk().setCoreJava(rs2.getInt(2));
				sb.getMk().setAdvJava(rs2.getInt(3));
				sb.getMk().setUi(rs2.getInt(4));
				sb.getMk().setDb(rs2.getInt(5));
				sb.getMk().setTools(rs2.getInt(6));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return sb;
	}
}
