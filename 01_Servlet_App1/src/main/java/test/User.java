package test;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/user")
public class User implements Servlet
{
	public void init(ServletConfig scf)
	{
		//NoCode
	}
	
	public void service(ServletRequest req,ServletResponse res) throws IOException
	{
		String fName=req.getParameter("fname");
		String lName=req.getParameter("lname");
		String mid=req.getParameter("mail");
		long mobNo=Long.parseLong(req.getParameter("mob"));
		String addr=req.getParameter("addr");
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("First Name : "+fName+"<br>");
		pw.println("Last Name : "+lName+"<br>");
		pw.println("Email ID : "+mid+"<br>");
		pw.println("Mobile No : "+mobNo+"<br>");
		pw.println("Address : "+addr+"<br>");
	}
	
	public void destroy()
	{
		//NoCode
	}
	
	public String getServletInfo()
	{
		return "This Server will display User Details";
	}
	
	public ServletConfig getServletConfig()
	{
		return this.getServletConfig();
	}
	
}
