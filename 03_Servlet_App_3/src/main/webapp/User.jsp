<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String fName=request.getParameter("fname");
		String lName=request.getParameter("lname");
		String city=request.getParameter("city");
		String mid=request.getParameter("mid");
		String pno=request.getParameter("phno");
		
		out.println("=====User Details====<br>");
		out.println("User Name : "+name+"<br>");
		out.println("Password : "+pass+"<br>");
		out.println("First Name : "+fName+"<br>");
		out.println("Last Name : "+lName+"<br>");
		out.println("City : "+city+"<br>");
		out.println("Mail Id : "+mid+"<br>");
		out.println("Phone no : "+pno+"<br>");
	%>
</body>
</html>