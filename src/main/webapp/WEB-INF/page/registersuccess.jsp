<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: red;">${msg}</h1>
	
	<h2>Welcome , ${register.name }</h2>
	<h3>Your email is , ${register.email }</h3>
	<h3>Your pas is , ${register.number }</h3>
	
	
	<h1>a<a href="login"> Click here to login</a></h1>
</body>
</html>