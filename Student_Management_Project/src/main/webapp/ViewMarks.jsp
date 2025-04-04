<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "test.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	AdminBean ab = (AdminBean) session.getAttribute("abean");
		StudentBean sb = (StudentBean) request.getAttribute("sbean");
		out.println("Page belongs to Admin : "+ab.getfName()+"<br>");
		out.println("RollNo : "+sb.getRollNo()+"<br>"
			+"CoreJava : "+sb.getMk().getCoreJava()+"<br>"
			+"Adv Java : "+sb.getMk().getAdvJava()+"<br>"
			+"UI : "+sb.getMk().getUi()+"<br>"
			+"DB : "+sb.getMk().getDb()+"<br>"
			+"Tools : "+sb.getMk().getTools()+"<br>"
		);
	%>
	<a href="edit?rno=<%= sb.getRollNo() %>">EditMarks</a>
	<a href="Student.html">AddStudent</a>
	<a href="view">ViewAllStudent</a>
	<a href="logout">Logout</a>
	
</body>
</html>