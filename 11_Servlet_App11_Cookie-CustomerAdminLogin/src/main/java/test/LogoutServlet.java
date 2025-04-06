package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		Cookie c[] = req.getCookies();
		if(c==null)
		{
			req.setAttribute("msg", "Session expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else {
			c[0].setMaxAge(0);   // Cookie destroyed
			res.addCookie(c[0]);  // add cookie expired to response obj
			req.setAttribute("msg", "LoggedOut Successfully...<br>");
			req.getRequestDispatcher("Logout.jsp").forward(req, res);
		}
	}
}


/*  1. c[0].setMaxAge(0);
This line sets the maximum age of the cookie to 0, which means the cookie is marked for deletion. 
This is how cookies are removed in HTTP—by sending back a cookie with the same name and a max age of 0.

2. res.addCookie(c[0]);
This line adds the updated (now expired) cookie to the response, so the browser knows to remove it
from its stored cookies. */