package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/perfect")
public class PerfectNo extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws IOException
	{
		int num=Integer.parseInt(req.getParameter("num"));
		int sum=0;
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		
		PrintWriter pw=res.getWriter();
		
		if(num==sum)
		{
			pw.println(num+ " is a Perfect no");
		}
		else {
			pw.println(num+ " is not a Perfect no");			
		}
		
	}
}
