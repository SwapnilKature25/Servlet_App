package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/avg")
public class AverageServlet extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException
	{
		int v1=Integer.parseInt(req.getParameter("v1"));
		int v2=Integer.parseInt(req.getParameter("v2"));
		float v3 = (v1+v2)/2;
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("Avg  : "+v3+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("input.html");
		rd.include(req, res);
		
	}
}
