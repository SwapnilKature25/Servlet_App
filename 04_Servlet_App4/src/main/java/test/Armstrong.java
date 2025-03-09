package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

// 153 => 1^3 + 5^3+ 3^3 => 153

@WebServlet("/armstrong")
public class Armstrong extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws IOException
	{
		int num=Integer.parseInt(req.getParameter("num"));
		
		PrintWriter pw=res.getWriter();
		
		int temp = num, sum = 0, digit;
        int count = String.valueOf(num).length();
        
        while (temp > 0) {
            digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
  
        if (num == sum) {
            pw.println(num + " is an Armstrong number");
        } else {
        	pw.println(num + " is not an Armstrong number");
        }
		
		
	}
}
