<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link rel="stylesheet" href="<c:url value="/resource/css/men.css"/>">
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<div class="container">
		<div class="col-lg-8  mt-5">
			<h1 class="section-heading text center">Product Inventory Page</h1>
			<p class="text-center text-primary">Here! This is the product inventory page</p>
			<hr class="primary">
		</div>
		<table class="table table-striped table-hover table-bordered">
			<thead>
				<tr class="bg-success text-center">
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Product Desc</th>
					<th>Product Price</th>
					<th></th>
				</tr>
			</thead>
			<c:forEach items="${products }" var="product1">
				<tr>
					<td>${product1.productId}</td>
					<td>${product1.pname}</td>
					<td>${product1.pdec}</td>
					<td>${product1.pprice}</td>
			</c:forEach>
		</table>
		<a href="<c:url value="/addProduct" />"
			class="btn btn-success">Add Mens Product</a>
		<a href="<c:url value="/addwomen" />"
			class="btn btn-success">Add Womens Product</a>
			<a href="<c:url value="/addkid" />"
			class="btn btn-success">Add Kids Product</a>
	</div>



	<%@ include file="footer.jsp"%>
</body>
</html>