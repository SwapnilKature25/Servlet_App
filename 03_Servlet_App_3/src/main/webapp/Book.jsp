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
	%>
		
	<h2>Book Details</h2>
	<table>
		<tr>
		<td>Book Code</td>
		<td><%= bCode %></td>		
		</tr>
		
		<tr>
		<td>Book Name</td>
		<td><%= bName %></td>		
		</tr>

		<tr>
		<td>Book Author</td>
		<td><%= bAuthor %></td>		
		</tr>
		
		<tr>
		<td>Book Price</td>
		<td><%= bPrice %></td>		
		</tr>

		<tr>
		<td>Book Quantity</td>
		<td><%= bQty %></td>		
		</tr>
		
		
	</table>
	
</body>
</html>