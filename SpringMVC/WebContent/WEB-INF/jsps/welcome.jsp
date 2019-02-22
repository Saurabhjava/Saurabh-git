<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome To Spring MVC!!</h1>
	<h2>You called me at <%=new Date()%></h2>
	<table border="1">
		<tr><td>${u.uid}</td><td>${u.uname}</td><td>${user.pwd}</td></tr>
	</table>
</body>
</html>