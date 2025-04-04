package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/log")
public class CustomerAdminLoginServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String un=req.getParameter("uname");
		String pw=req.getParameter("pword");
		
		AdminBean ab = new CustomerAdminLoginDao().login(un,pw);
		if(ab == null)
		{
			req.setAttribute("msg", "Invalid Login Process....<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else {
			Cookie ck = new Cookie("fname",ab.getfName());
			res.addCookie(ck);   // Cookie is added to response
			req.setAttribute("fn", ab.getfName());
			req.getRequestDispatcher("CustomerAdminLogin.jsp").forward(req, res);
		}
	}
	
}
