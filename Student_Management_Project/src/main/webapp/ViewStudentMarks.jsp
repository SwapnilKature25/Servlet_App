<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		StudentBean sb = (StudentBean) session.getAttribute("sbean");
		out.println("Core Java : "+sb.getMk().getCoreJava()+"&nbsp;"+
				"Adv Java : "+sb.getMk().getAdvJava()+"  "+
				"UI : "+sb.getMk().getUi()+"  "+
				"DB : "+sb.getMk().getDb()+"  "+
				"Tools : "+sb.getMk().getTools()+"<br>");
	%>
	<a href="studentlogout">Logout</a>
</body>
</html>