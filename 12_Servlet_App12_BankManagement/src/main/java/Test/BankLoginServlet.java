package Test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/log")
public class BankLoginServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String un=req.getParameter("uname");
		String pw=req.getParameter("pword");
		BankBean bb = new BankLoginDao().retrieve(un,pw);
		
		if(bb == null)
		{
			req.setAttribute("msg", "Account not available...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else {
			Cookie ck = new Cookie("fname",bb.getUname());
			res.addCookie(ck);
			req.setAttribute("fn", bb.getUname());
			req.getRequestDispatcher("BankLoginSuccess.jsp").forward(req, res);
			
		}
	}
	
}
