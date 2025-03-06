package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/employee")
public class EmployeeServlet implements Servlet
{
	@Override
	public void init(ServletConfig scf)
	{
		
	}
	
	@Override
	public void service(ServletRequest req,ServletResponse res) throws IOException
	{
		int id=Integer.parseInt(req.getParameter("eid"));
		String eName = req.getParameter("ename");
		String eAddr = req.getParameter("addr");
		double sal=Double.parseDouble(req.getParameter("sal"));
		String gen=req.getParameter("gen");
		String profile=req.getParameter("prof");
		String hob=req.getParameter("hob");
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("^^^^^Employee Information^^^^^"+"<br>");
		pw.println("Employee Id : "+id+"<br>");
		pw.println("Employee Name : "+eName+"<br>");
		pw.println("Employee Address : "+eAddr+"<br>");
		pw.println("Employee Salary : "+sal+"<br>");
		pw.println("Employee Gender : "+gen+"<br>");
		pw.println("Employee Profile : "+profile+"<br>");
		pw.println("Employee Hobbies : "+hob+"<br>");
	}
	
	@Override
	public void destroy()
	{
		
	}
	
	@Override
	public String getServletInfo()
	{
		return "This Server will Display Employee details";
	}
	
	@Override
	public ServletConfig getServletConfig()
	{
		return this.getServletConfig();		
	}
	
	

}
