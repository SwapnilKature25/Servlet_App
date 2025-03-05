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
		String bCode=request.getParameter("bcode");	
		String bName=request.getParameter("bname");	
		String bAuthor=request.getParameter("bauthor");	
		int bPrice=Integer.parseInt(request.getParameter("bprice"));
		int bQty=Integer.parseInt(request.getParameter("bqty"));
		
		out.println("**** Book Details ****");
		out.println("Book Code : "+bCode+"<br>");
		out.println("Book Name : "+bName+"<br>");
		out.println("Book Author : "+bAuthor+"<br>");
		out.println("Book Price : "+bPrice+"<br>");
		out.println("Book Quantity : "+bQty+"<br>");
	
	%>
</body>
</html>