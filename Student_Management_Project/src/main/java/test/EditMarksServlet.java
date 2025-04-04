package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditMarksServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs == null)
		{
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else 
		{
			ArrayList<StudentBean> al =(ArrayList<StudentBean>) hs.getAttribute("alist");
			String rno = req.getParameter("rno");
			Iterator<StudentBean> it = al.iterator();
			while(it.hasNext())
			{
				StudentBean sb = (StudentBean)it.next();
				
				if (rno.equals(sb.getRollNo())) 
				{
					req.setAttribute("sbean", sb);
					req.getRequestDispatcher("EditMarks.jsp").forward(req, res);
					break;
				}
			}
		}
	}
}
