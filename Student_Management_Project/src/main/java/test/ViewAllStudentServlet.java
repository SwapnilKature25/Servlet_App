package test;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAllStudentServlet extends HttpServlet
{
	protected void  doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);  // Accessing existing session
		if(hs == null)
		{
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else {
			ArrayList<StudentBean> al=new ViewAllStudentsDao().retrieve();
			hs.setAttribute("alist", al);   // list object added to session
			req.getRequestDispatcher("ViewAllStudents.jsp").forward(req, res);
			
		}
	}
}
