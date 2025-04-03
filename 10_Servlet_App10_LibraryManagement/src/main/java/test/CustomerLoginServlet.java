package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/cust")
public class CustomerLoginServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		CustomerBean cb = new CustomerLoginDao().login(req);
		if(cb == null)
		{
			req.setAttribute("msg", "User not found");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else {
			HttpSession hs=req.getSession();  // Creating new Session
			hs.setAttribute("cbean", cb);
			req.getRequestDispatcher("CustomerLoginSuccess.jsp").forward(req, res);
		}
	}
	
}
