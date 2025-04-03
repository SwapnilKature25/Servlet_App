package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/studLog")
public class StudentLoginServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		StudentBean sb = new StudentLoginDao().login(req);
		System.out.println(sb);
		if(sb==null)
		{
			req.setAttribute("msg", "Login Failed...");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else {
			HttpSession hs=req.getSession();  // Creating new Session
			hs.setAttribute("sbean", sb);	// AdminBean is added to Session
			req.getRequestDispatcher("StudentLoginSuccess.jsp").forward(req, res);
		
		}
	}
}
