package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/prime")
public class Prime extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws IOException, ServletException
	{
		int n=Integer.parseInt(req.getParameter("num"));
		
		int count = 2;
		
		for(int i=2; i<=n/2; i++)
		{
			if(n%2==0) count++;
		}
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		if(count == 2)
		{
			pw.print(n + " is a Prime no");
		}
		else {
			pw.print(n + " is not a Prime no");			
		}
		
//		RequestDispatcher rd=req.getRequestDispatcher("input.html");
//		rd.include(req, res);
	}
}
