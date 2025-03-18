package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewAllStudentsDao {
	public ArrayList<StudentBean> std = new ArrayList<>();
	
	public ArrayList<StudentBean> retrieve()
	{
		try
		{
			Class.forName(DBInfo.driver);
			Connection con= DriverManager.getConnection
					(DBInfo.dbURL, DBInfo.dbUName, DBInfo.dbPWord);
			
			PreparedStatement ps1 = con.prepareStatement
					("select * from Student");
			
			PreparedStatement ps2 = con.prepareStatement
					("select *from Marks");
			
			ResultSet rs1 = ps1.executeQuery();
			ResultSet rs2= ps2.executeQuery();
			
			if(rs1.next() && rs2.next())
			{
				StudentBean sb = new StudentBean();
				sb.setRollNo(rs1.getString(1));
				sb.setName(rs1.getString(2));
				sb.setCourse(rs1.getString(3));
				sb.setTotMarks(rs1.getInt(4));
				sb.setPer(rs1.getFloat(5));
				sb.setResult(rs1.getString(6));
				
				sb.getMk().setCoreJava(rs2.getInt(2));
				sb.getMk().setAdvJava(rs2.getInt(3));
				sb.getMk().setUi(rs2.getInt(4));
				sb.getMk().setDb(rs2.getInt(5));
				sb.getMk().setTools(rs2.getInt(6));
				std.add(sb);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return std;
	}
	
}
