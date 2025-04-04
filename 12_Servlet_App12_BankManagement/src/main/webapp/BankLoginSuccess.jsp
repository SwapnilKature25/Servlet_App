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
		String cust=(String)request.getAttribute("fn");
		out.println("Welcome "+cust+"<br>");
	
	%>
	<label>Banking Application</label> <br>
	<a href="balance">Balance</a> <br>
	<a href="deposit">Deposit</a> <br>
	<a href="withdraw">Withdraw</a> <br>
	<a href="tmoney">Transfer Money</a> <br>
	<a href="logout">Close Account</a> <br>
	<a href="about">About</a> <br>
</body>
</html>