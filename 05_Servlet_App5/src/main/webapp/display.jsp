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
		int id=Integer.parseInt(request.getParameter("uid"));
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		String mId = request.getParameter("mid");
		long phNo=Long.parseLong(request.getParameter("pno"));
		
		out.println("=-=-=-PLAYER DETAILS-=-=-=<br>");
		out.println("Player ID : "+id+"<br>");
		out.println("Player First Name : "+fName+"<br>");
		out.println("Player Last Name : "+lName+"<br>");
		out.println("Player MailId : "+mId+"<br>");
		out.println("Player Phone No : "+phNo+"<br>");
		
	%>
</body>
</html>