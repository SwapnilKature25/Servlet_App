<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String fn = (String)request.getAttribute("fn");
		out.println("Welcome Admin : "+fn+"<br>");
	%>
	<a href="view">ViewAllCustomers</a>
	<a href="logout">Logout</a>
</body>
</html>