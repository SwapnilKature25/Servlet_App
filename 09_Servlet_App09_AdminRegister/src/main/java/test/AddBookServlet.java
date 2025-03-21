package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/addbook")
public class AddBookServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		BookBean b = new BookBean();
		b.setbId(Integer.parseInt(req.getParameter("bid")));
		b.setbName(req.getParameter("bname"));
		b.setbAuthor(req.getParameter("bauthor"));
		b.setbPrice(Integer.parseInt(req.getParameter("bprice")));
		b.setbQty(Integer.parseInt(req.getParameter("bqty")));
		
		int k = new AddBookDao().add(b);
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		if(k > 0)
		{
			pw.println("Book Details added successfully....");
			req.getRequestDispatcher("LoginSuccess.jsp").include(req, res);
		}
		else 
		{
			pw.println("Failed to add Book Details!");
		}
		
	}
	
}
