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

	<div class="container d-flex flex-wrap  "style="margin-top: 7rem; justify-content: space-around;">

		<c:forEach items="${womenPro }" var="product1">
			<div class="row">
				<div class="col-sm-6 col-md-4">
					<div class="card" style="width: 300px; padding: .5rem">
						<img class="card-img-top" src="<c:url value="${product1.wurl }"/>"
							alt="Card image" style="width: 100%; height: 280px">
						<div class="card-body">
							<h3 class="card-title">${product1.wname }</h3>
							<p class="card-text">${product1.wdec }</p>
							<h4>Price &#8377; ${product1.wprice }</h4>
							<a href="<c:url value="/viewWomen/${product1.womenid }"/>"
								class="btn btn-primary">Go to know more</a>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>


	<%@ include file="footer.jsp"%>
















	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>