package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		AdminBean ab = new LoginDao().login(req);
		PrintWriter pw=res.getWriter();	
		res.setContentType("text/html");
		if(ab != null)
		{
			req.getRequestDispatcher("LoginSuccess.jsp").forward(req, res);
		}
		else 
		{
			pw.println("Login Failed...");
			req.getRequestDispatcher("Admin_login.html").include(req, res);
		}
	}
}
