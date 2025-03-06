package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/player")
public class Player implements Servlet
{
	@Override
	public void init(ServletConfig scf)
	{
		//NoCode
	}
	
	@Override
	public void service(ServletRequest req,ServletResponse res) throws IOException
	{
		int pid=Integer.parseInt(req.getParameter("id"));
		String fName=req.getParameter("fname");
		String lName=req.getParameter("lname");
		String mid=req.getParameter("mid");
		long phno=Long.parseLong(req.getParameter("phno"));
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("Player Id : "+pid+"<br>");
		pw.println("Player First Name : "+fName+"<br>");
		pw.println("Player Last Name : "+lName+"<br>");
		pw.println("Player Mail-Id : "+mid+"<br>");
		pw.println("Player PhnoNo : "+phno+"<br>");
	}
	
	@Override
	public void destroy()
	{
		//NoCode
	}
	
	@Override
	public String getServletInfo()
	{
		return "This Server will Display customer details";
	}
	
	@Override
	public ServletConfig getServletConfig()
	{
		return this.getServletConfig();				
	}
	
}
