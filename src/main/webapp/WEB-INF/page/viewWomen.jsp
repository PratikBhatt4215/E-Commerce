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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<div class="container mt-5">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12 ">
					<h2 class="section-heading text-center">View Product</h2>
					<p class="text-center">Here is the details information of the
						product</p>
					<hr>
				</div>
			</div>
		</div>

		<div class="row " style="margin-left: 25rem;">
			<div class="col-sm-6 col-md-4">
				<div class="card" style="width: 300px">
					<img class="card-img-top"
						src="<c:url value="${getwomen.wurl }"/>" alt="Card image"
						style="width: 100%; height: 280px">

					<div class="card-body">
						<h3 class="card-title">
							<strong>Product Name :-</strong>${getwomen.wname }</h3>
						<p class="card-text text-primary">Product Description :-${getwomen.wdec }</p>
						<h4>Product Price :- &#8377; ${getwomen.wprice }</h4>
						<a href="#" class="btn btn-primary">Go to know more</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>