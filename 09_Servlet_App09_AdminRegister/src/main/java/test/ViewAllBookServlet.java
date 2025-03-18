package test;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/viewBook")
public class ViewAllBookServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		//req.getRequestDispatcher("ViewAllBookDao.java").forward(req, res);
	List<BookBean> lst=	new ViewAllBookDao().viewAllBooks(req);
	if(lst==null)
	{
		req.setAttribute("msg","Book not available");
	}
	else {
		req.setAttribute("al", lst);
	}
	req.getRequestDispatcher("ViewBooks.jsp").forward(req, res);
	}
}
