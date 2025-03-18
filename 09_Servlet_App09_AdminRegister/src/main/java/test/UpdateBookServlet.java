package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/updBook")
public class UpdateBookServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		UpdateBookDao ub = new UpdateBookDao();
		int k = ub.updateBook(req);
		
		if( k > 0)
		{
			pw.println("Book Updated Successfully....");
			req.getRequestDispatcher("LoginSuccess.jsp").include(req, res);
		}
		else
		{
			pw.println("Failed to update book!!");			
		}
		
	}
}
