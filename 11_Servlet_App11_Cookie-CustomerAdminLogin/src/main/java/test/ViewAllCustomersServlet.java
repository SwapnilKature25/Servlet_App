package test;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAllCustomersServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		Cookie c[] = req.getCookies();
		if(c==null)
		{
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else {
			String fn = c[0].getValue();
			req.setAttribute("fname", fn);
			ArrayList<CustomerBean> al = new ViewAllCustomersDao().retrieve();
			req.setAttribute("alist", al);
			req.getRequestDispatcher("ViewAllCustomers.jsp").forward(req, res);
		}
	}
}
