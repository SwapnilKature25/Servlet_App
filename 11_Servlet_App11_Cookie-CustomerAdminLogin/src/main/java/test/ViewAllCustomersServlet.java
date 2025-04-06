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

/*
Step-by-step Explanation:

1. String fn = c[0].getValue();
This retrieves the value of the first cookie in the array c. It's assumed that this cookie stores the user's first name (or some other identifier like a username or ID).

2. req.setAttribute("fname", fn);
The value retrieved from the cookie (fn) is now stored in the request under the attribute name "fname".
This allows the JSP (ViewAllCustomers.jsp) to access and display the user's name (e.g., Welcome, John!).

3. ArrayList<CustomerBean> al = new ViewAllCustomersDao().retrieve();
This line calls the retrieve() method from ViewAllCustomersDao, which presumably connects to a database and fetches all customer records, returning them in an ArrayList of CustomerBean objects.

4. req.setAttribute("alist", al);
The list of customers (al) is stored in the request under the attribute name "alist", so it can be displayed in the JSP page.

5. req.getRequestDispatcher("ViewAllCustomers.jsp").forward(req, res);
Finally, the request is forwarded to ViewAllCustomers.jsp, where both the user’s name (fname) and the list of customers (alist) will be displayed.



*/