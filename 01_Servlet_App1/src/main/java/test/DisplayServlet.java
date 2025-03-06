package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/dis")

public class DisplayServlet implements Servlet
{

	@Override
	public void init(ServletConfig scf) throws ServletException 
	{
		//NoCode
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String cid=req.getParameter("cid");
		String cname=req.getParameter("cname");
		String ccity=req.getParameter("ccity");
		String mid=req.getParameter("cmid");
		long phno=Long.parseLong(req.getParameter("cphno"));
		
		PrintWriter pw=res.getWriter();
		res.setContentType("Text/html");
		pw.println("CustId : "+cid+"<br>");
		pw.println("CustName : "+cname+"<br>");
		pw.println("CustCity : "+ccity+"<br>");
		pw.println("CustMailId : "+mid+"<br>");
		pw.println("CustPhoneNo : "+phno+"<br>");
			
	}
	
	@Override
	public void destroy() 
	{
		//NoCode
	}

	
	@Override
	public String getServletInfo() {
		return "This Server will Display customer details";
	}
	
	
	@Override
	public ServletConfig getServletConfig() 
	{
		return this.getServletConfig();
	}

	
}
