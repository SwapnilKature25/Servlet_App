<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "test.*, java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String ab = (String)request.getAttribute("fname");
		out.println("Page to belongs to Admin : "+ab+"<br>");
		ArrayList<CustomerBean> al=(ArrayList<CustomerBean>)request.getAttribute("alist");
		if(al.size() == 0)
		{
			out.println("No Students Available...<br>");
		}
		else {
			Iterator<CustomerBean> it=al.iterator();
			while(it.hasNext())
			{
				CustomerBean cb=(CustomerBean)it.next();
				out.println(cb.getPhNo()+"&nbsp&nbsp"+
							cb.getName()+ "&nbsp&nbsp"+
							cb.getCity()+"&nbsp&nbsp"+
							cb.getMid()+"<br>");
			}
		}
	%>
</body>
</html>