package Test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/balance")
public class BalanceServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String un=req.getParameter("uname");
		String pw=req.getParameter("pword");
		System.out.println(un+" "+pw);
		BankBean bb = new BalanceDao().getBal(un, pw);
		if(bb.getBalance() == 0)
		{
			req.setAttribute("msg", "Account not found...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else {
			req.setAttribute("bal", bb.getBalance());
			req.getRequestDispatcher("Balance.jsp").forward(req, res);
		}
	}
	
}
