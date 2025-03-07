package test;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
//@WebServlet("/display")
public class DisplayServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException, IOException
	{
		ServletConfig scf = super.getServletConfig();
		req.setAttribute("sf", scf);
		req.getRequestDispatcher("Display.jsp").forward(req, res);
	}
}
