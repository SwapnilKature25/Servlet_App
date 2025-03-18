package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/stud")
public class AddStudentServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw = res.getWriter();
//		pw.println("inside stud servlet");
		HttpSession hs = req.getSession(false);  // Accessing existing session
		if(hs==null)
		{
			req.setAttribute("msg", "Session expired.....<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);;
		}
		else {
			StudentBean sb = new StudentBean();
			sb.setRollNo(req.getParameter("rno"));
			sb.setName(req.getParameter("name"));
			sb.setCourse(req.getParameter("course"));
			int cj = Integer.parseInt(req.getParameter("cj"));
			int aj = Integer.parseInt(req.getParameter("aj"));
			int ui = Integer.parseInt(req.getParameter("ui"));
			int db = Integer.parseInt(req.getParameter("db"));
			int tools = Integer.parseInt(req.getParameter("tools"));
			
			int totMarks = cj + aj + ui + db + tools;
			float per = (float)totMarks/5;
			String result = null;
			
			if(per >=70 && per <=100)	result = "A";
			else if(per >=60 && per <=70)	result = "B";
			else if(per >=50 && per <=60)	result = "C";
			else result = "D";
			
			sb.getMk().setCoreJava(cj);
			sb.getMk().setAdvJava(aj);
			sb.getMk().setUi(ui);
			sb.getMk().setDb(db);
			sb.getMk().setTools(tools);
			sb.setTotMarks(totMarks);
			sb.setPer(per);
			sb.setResult(result);
			
			int k = new AddStudentDAO().insert(sb);
			
			if(k>0)
			{
				req.setAttribute("msg", "Student Added Successfully...<br>");
				req.getRequestDispatcher("AddStudent.jsp").forward(req, res);
			}
			
			
		}
	}
}
