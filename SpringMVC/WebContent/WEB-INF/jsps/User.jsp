<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	.errmsg{
		color: red;
	}
</style>
</head>
<body>
	<f:form action="adduser" commandName="u" method="get">
		<table>
			<tr>
			<td>UserId</td>
			<td><f:input path="uid"/>
				<f:errors path="uid" cssClass="errmsg"/>
			</td> 
			<tr>
			<tr>
			<td>UserName</td>
			<td><f:input path="uname"/>
			<f:errors path="uname" cssClass="errmsg"/>
			</td> 
			<tr>
			<tr>
			<td>Password</td>
			<td><f:password path="pwd"/>
			<f:errors path="pwd" cssClass="errmsg"/>
			</td> 
			<tr>
			<tr>
			<td>Email</td>
			<td><f:input path="email"/>
			<f:errors path="email" cssClass="errmsg"/>
			</td> 
			<tr>
			<tr>
			<td><f:button value="AddUser">AddUser</f:button></td> 
			<tr>
		</table>
	</f:form>
</body>
</html>