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

@WebServlet("/update")
public class UpdateMarksServlet  extends HttpServlet
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
				StudentBean sb = (StudentBean) it.next();
				if(rno.equals(sb.getRollNo()))
				{
					sb.getMk().setCoreJava(Integer.parseInt(req.getParameter("corejava")));
					sb.getMk().setAdvJava(Integer.parseInt(req.getParameter("advjava")));
					sb.getMk().setUi(Integer.parseInt(req.getParameter("ui")));
					sb.getMk().setDb(Integer.parseInt(req.getParameter("db")));
					sb.getMk().setTools(Integer.parseInt(req.getParameter("tools")));				
					int k = new UpdateMarksDao().update(sb);
					if(k>0)
					{
						req.setAttribute("msg", "Marks Updated...<br>");
						req.getRequestDispatcher("UpdateMarks.jsp").forward(req, res);
					}
					
				}
				
			}
		
		}
	}
}
