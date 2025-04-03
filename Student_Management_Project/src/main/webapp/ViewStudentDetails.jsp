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
		StudentBean sb = (StudentBean)session.getAttribute("sbean");
		out.println("Page belongs to Student : "+sb.getName()+"<br>");
		
		out.println("Student RollNo : "+sb.getRollNo()+"  "+
					"Student Name : "+sb.getName()+"  "+
					"Student Course : "+sb.getCourse()+"  "+
					"Student TotalMarks : "+sb.getTotMarks()+"  "+
					"Student Per : "+sb.getPer()+"  "+
					"Student Result : "+sb.getResult()+"<br>"					
				);
	%>
	<a href="viewstudentmarks">View Marks</a>
	<a href="studentlogout">Logout</a>
</body>
</html>