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
		Double bal=(Double)request.getAttribute("bal");
		out.println("Balance : "+bal+"<br>");
	%>
	<%@include file="BankLoginSuccess.jsp" %>
</body>
</html>