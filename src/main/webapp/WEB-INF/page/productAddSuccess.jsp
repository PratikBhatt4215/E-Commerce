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
	
	<h2>Welcome , ${product.pname }</h2>
	<h3>Your email is , ${product.pdec }</h3>
	<h3>Your pas is , ${product.pprice }</h3>
	
	
	<h1>a<a href="productadd">Go Back</a></h1>
</body>
</html>