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


<link rel="stylesheet" href="<c:url value="/resource/css/login.css"/>">
<script type="text/javascript">
	setTimeout(function() {
		$('#hide').fadeOut('fast');
	}, 5000);

	setTimeout(function() {
		$('#hide1').fadeOut('fast');
	}, 5000);
</script>
<script>
	function validateForm() {
		var email = document.getElementById("email").value;
		var pass = document.getElementById("password").value;
		if (email.length < 1) {
			alert("email must be filled out");
			return false;
		}

		if (pass.length < 1) {
			alert("password must be filled out");
			return false;
		}
	}
</script>
</head>
<body>
	<%@ include file="navbar.jsp"%>

	<div class=" container pt-5 mt-2 " style="padding: 130px">
		<div class="global-container">
			<div class="card login-form">
				<div class="card-body">
					<h4 style="color: red;" id="hide" class="text-center">${succesmsg}</h4>
					<h4 style="color: red;" id="hide1" class="text-center">${loginfail}</h4>
					<h1 class="card-title text-center">Login Here</h1>
					<div class="card-text">
						<form action="dologin" method="post"onsubmit=" return validateForm()">
							<div class="form-group">
								<label for="exampleInputEmail1"> Enter Email address </label> <input
									type="email" name="lemail" class="form-control form-control-sm"
									id="email" aria-describedby="emailHelp">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Password </label> <a
									href="#" style="float: right; font-size: 12px;"> Forgot
									password? </a> <input type="password" name="lpassword"
									class="form-control form-control-sm" id="password">
							</div>
							<button type="submit" class="btn btn-primary btn-block">
								Sign in</button>

							<div class="sign-up">
								Don't have an account? <a href="register"> Create One </a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="footer.jsp"%>

		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
</body>
</html>