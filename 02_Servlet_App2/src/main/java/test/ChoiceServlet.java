package test;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/choice")
public class ChoiceServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String sb = req.getParameter("sb");
		if(sb.equals("Add"))
		{
			 RequestDispatcher rd=req.getRequestDispatcher("ad");
			 rd.forward(req, res);
		}
		else if(sb.equals("Avg"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("avg");
			rd.forward(req, res);
		}
		else if(sb.equals("Sub")){
			RequestDispatcher rd=req.getRequestDispatcher("sub");
			rd.forward(req, res);
		}
		else if(sb.equals("Mult")) 
		{
			RequestDispatcher rd=req.getRequestDispatcher("mult");
			rd.forward(req, res);
		}
		else if(sb.equals("Div")) 
		{
			RequestDispatcher rd=req.getRequestDispatcher("div");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("mod");
			rd.forward(req, res);
		}
	}
	
}
