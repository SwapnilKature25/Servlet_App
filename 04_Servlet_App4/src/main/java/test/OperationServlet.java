package test;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/opr")
public class OperationServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException, IOException
	{
		String num=req.getParameter("opt");
		
		if(num.equals("Prime"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("prime");
			rd.forward(req, res);
		}
		else if(num.equals("PalindromeNo"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("palindrome");
			rd.forward(req, res);
		}
		else if(num.equals("ArmstrongNo"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("armstrong");
			rd.forward(req, res);
		}
		else if(num.equals("PerfectNo"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("perfect");
			rd.forward(req, res);			
		}

	}

}
