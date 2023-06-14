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
<title>Cart</title>
<link rel="stylesheet" href="<c:url value="/resource/css/admin.css"/>">
</head>

<body>
	<%@ include file="navbar.jsp"%>

	<h3 class="text-center">Cart Page</h3>
	<div class="container " style="margin-top: 3rem">
		<table class="table table-hover  ">
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Price</th>
				<th>Product Description</th>
				<th>Product Image Url</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="item" items="${getCart }">
				<tr>
					<td>${item.productId }</td>
					<td>${item.pname }</td>
					<td>${item.pprice }</td>
					<td>${item.pdec }</td>
					<td>${item.purl }</td>
					<td><a href="<c:url value="/delete/${item.productId }"/>"
								class="btn btn-primary">Delete</a></td>
				</tr>

			</c:forEach>
		</table>
		<div class="container " style="margin-left: 40%;">
			<h3 class="text-center text-danger">Total Items Price :- ${total }</h3>
			<h3 class="text-center text-danger">Shipping Charge :- ${Ship }</h3>
			<h3 class="text-center text-danger">Grand Total Charge :-
				${grand }</h3>
		</div>
	</div>
	<br>


	<a href="<c:url value="/backtohome"/>">Continue Shopping</a>





	<%@ include file="footer.jsp"%>

</body>
</html>