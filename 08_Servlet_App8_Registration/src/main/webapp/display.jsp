<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
        .container {
            max-width: 800px;
            margin: 50px auto;
            background: #fff;
            padding: 20px;
            border-radius: 20px;
           /* box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);*/
            display: flex;
      		justify-content: center ;
            gap: 10px;
            font-family: Arial, sans-serif;
        }
        h1 {
            text-align: center;
            margin-bottom: 20px;
        }
        .container div {
            padding: 10px;
        }
        .label {
            font-weight: bold;
            text-align: right;
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
    <h1>Register User</h1>
    <div class="container">
        <div class="label">Name:</div><div><%= name %></div>
        <div class="label">Email:</div><div><%= mail %></div>
        <div class="label">Phone:</div><div><%= phno %></div>
        <div class="label">Gender:</div><div><%= gen %></div>
        <div class="label">DOB:</div><div><%= dob %></div>
        <div class="label">Address:</div><div><%= addr %></div>
        <div class="label">City:</div><div><%= cty %></div>
        <div class="label">State:</div><div><%= st %></div>
        <div class="label">Country:</div><div><%= ctry %></div>
        <div class="label">Password:</div><div><%= pass %></div>
    </div>
</body>
</html>