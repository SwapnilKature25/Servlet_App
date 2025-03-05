package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/palindrome")
public class Palindrome extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws IOException
	{
		int n = Integer.parseInt(req.getParameter("num"));
		int rem=0,rev=0,m;
		m=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		PrintWriter pw=res.getWriter();
		
		if(m==rev)
		{
			pw.println(m+" is a Palindrome number");			
		}
		else {
			pw.println(m+" is not Palindrome number");			
		}
	}
}
