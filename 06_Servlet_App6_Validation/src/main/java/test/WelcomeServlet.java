package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/welcome")
public class WelcomeServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws IOException
	{
		String name = req.getParameter("name");
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("Welcome , "+name+" to our Portfolio");
	}
}
