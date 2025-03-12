package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		AdminBean ab = new AdminBean();
		ab.setName(req.getParameter("name"));
		ab.setPass(req.getParameter("pass"));
		ab.setfName(req.getParameter("fname"));
		ab.setlName(req.getParameter("lname"));
		ab.setMid(req.getParameter("mid"));
		ab.setPhno(Long.parseLong(req.getParameter("pno")));
		
		int k =new AdminDao().reg(ab);
		PrintWriter pw=res.getWriter();	
		res.setContentType("text/html");
		if(k > 0 )
		{
			pw.println("Admin Registered successfully..");
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.include(req, res);
		}
		else {
			pw.println("Admin Registered Failed!!");
		}
	}
}
