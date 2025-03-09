package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/validate")
public class Validation extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		String name = req.getParameter("name");
		long pass = Long.parseLong(req.getParameter("pass"));
		PrintWriter pw=res.getWriter();
		
		if(name.equals("Swapnil") && pass == 898989)
		{
			RequestDispatcher rd=req.getRequestDispatcher("welcome");
			rd.forward(req, res);
		}
		else 
		{	
			pw.println("Sorry username or password error !     ");
			RequestDispatcher rd= req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}	
	}
}
