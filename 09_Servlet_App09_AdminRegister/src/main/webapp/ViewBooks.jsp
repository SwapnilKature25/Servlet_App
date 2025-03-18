<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    @import="java.util.*,test.BookBean";
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>*************************</h1>
	<table>
	<tr>
		<th>BookId</th>
		<th>BookName</th>
		<th>BookAuthor</th>
		<th>BookPrice</th>
		<th>BookQty</th>
	</tr>
	<%
	ArrayList<BookBean> lst = (ArrayList<BookBean>)request.getAttribute("al");
	lst.stream().forEach(x ->
	{
		%>
			<tr>
				<td><%=x.getbId() %></td>
				<td><%=x.getbName() %></td>
				<td><%=x.getbAuthor() %></td>
				<td><%=x.getbPrice() %></td>
				<td><%=x.getbQty() %></td>
			</tr>			
		<%
	}
	);
	%>
	</table>
</body>
</html>