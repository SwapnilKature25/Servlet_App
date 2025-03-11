<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		div{
			 background: #fff;
            padding: 20px;
            border-radius: 20px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            display: flex;
            flex-direction: row;
            width: 100%;
            text-align: center;
		}
		h2{
			padding : 10px
			display : flex;
			justify-content : space-between;
		}
		p{
			padding : 10px;
		}
	</style>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		long phno = Long.parseLong(request.getParameter("number"));
		String gen = request.getParameter("gen");
		String dob = request.getParameter("dob");
		String addr = request.getParameter("addr");
		String cty = request.getParameter("city");
		String st = request.getParameter("state");
		String ctry = request.getParameter("country");
		String pass = request.getParameter("pass");
	%>
	<h1>Register Users</h1>
	<div>
		<h2>Name</h2>
		<h2>Email</h2>
		<h2>Phone</h2>
		<h2>Gender</h2>
		<h2>DOB</h2>
		<h2>Address</h2>
		<h2>City</h2>
		<h2>State</h2>
		<h2>Country</h2>
		<h2>Password</h2>
	</div>
	<div>
		<p><%= name %></p>	
		<p><%= mail %></p>	
		<p><%= phno %></p>	
		<p><%= gen %></p>	
		<p><%= dob %></p>	
		<p><%= addr %></p>	
		<p><%= cty %></p>	
		<p><%= st %></p>	
		<p><%= ctry %></p>	
		<p><%= pass %></p>	
	</div>

</body>
</html>