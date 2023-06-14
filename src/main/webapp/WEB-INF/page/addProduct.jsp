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

<link rel="stylesheet"
	href="<c:url value="/WEB-INF/resource/css/addp.css"/>">
</head>
<script type="text/javascript">
	setTimeout(function() {
		$('#hide').fadeOut('fast');
	}, 5000);
</script>
<body>
	<%@ include file="navbar.jsp"%>
	<div class="container mt-5">
		<div class="pt-5">
			<div class="global-container">
				<div class="card login-form">
					<div class="card-body">
						<h4 style="color: red;" id="hide" class="text-center">${msg1}</h4>
						<h1 class="card-title text-center">Add Product here</h1>
						<div class="card-text">
							<form action="addproduct" method="post">
								<div class="form-group">
									<label for="exampleInputEmail1"> Enter Product Name </label> <input
										type="text" name="pname" class="form-control form-control-sm"
										id="exampleInputEmail1" aria-describedby="emailHelp">
								</div>

								<div class="form-group">
									<label for="exampleFormControlTextarea1">Enter Product
										Desc</label>
									<textarea class="form-control" name="pdec"
										id="exampleFormControlTextarea1" rows="3"></textarea>
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1"> Enter Product Price </label> <input
										type="number" name="pprice"
										class="form-control form-control-sm" id="exampleInputEmail1"
										aria-describedby="emailHelp">
								</div>

								<div class="form-group">
									<label for="exampleInputPassword1">Enter Product url </label> <input
										type="text" name="purl" class="form-control form-control-sm"
										id="exampleInputPassword1">
								</div>
								<div class="form-group">
									<label for="exampleFormControlSelect1">Choose which
										gender cloths you want to add</label> <select class="form-control"
										name="pgender" id="exampleFormControlSelect1">
										<option>Men</option>
										<option>Women</option>
										<option>Kid</option>
									</select>
								</div>

								<button type="submit" class="btn btn-primary btn-block">
									Add</button>

							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="footer.jsp"%>


		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
</body>
</html>