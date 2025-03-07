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
		String uName=request.getParameter("name");
		out.println("Welcome User : "+ uName + "<br>");
		
		out.println("**** ServletContext *****<br>");
		out.println("Servlet Info : "+application.getServerInfo()+"<br>");
		out.println("Context-Value : "+application.getInitParameter("a")+"<br>");
		
		out.println("**** ServletConfig******<br>");
		ServletConfig scf= (ServletConfig)request.getAttribute("sf");
		out.println("ServletName : "+scf.getServletName()+"<br>");
		out.println("Config-Value : "+scf.getInitParameter("b")+"<br>");

		out.println("**** JSP Config******<br>");
		out.println("ServletName : "+config.getServletName()+"<br>");
		
	%>
</body>
</html>