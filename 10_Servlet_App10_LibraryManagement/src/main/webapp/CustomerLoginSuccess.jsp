<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "test.AdminBean"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	AdminBean cb =(AdminBean) session.getAttribute("cbean");
		out.println("Welcome Customer : "+cb.getName());
	%>
	<a href="products">View Products</a>
</body>
</html>