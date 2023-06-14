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
	href="<c:url value="/resource/css/register.css"/>">
</head>
<script type="text/javascript">
setTimeout(function() {
	$('#hide').fadeOut('fast');
}, 5000);
</script>
<script>
	function validateForm() {
		var email = document.getElementById("email").value;
		var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("cpassword").value;
		if (email.length < 1) {
			alert("email must be filled out");
			return false;
		}

		if (password.length < 1) {
			alert("password must be filled out");
			return false;
		}
		
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
	}

</script>
<body>
	<%@ include file="navbar.jsp"%>
	<div class="container " style="padding: 130px">
		<div>
			<div class="global-container">
				<div class="card login-form">
					<div class="card-body">
					<h4 style="color: red;" id="hide" class="text-center">${alreadyReg}</h4>
						<h1 class="card-title text-center">Register Here</h1>
						<%-- <h4 style="color: red;" id="hide" class="text-center">${msg}</h4> --%>
						<div class="card-text">
							<form action="doregister" method="post"onsubmit=" return validateForm()">
								<div class="form-group">
									<label for="exampleInputEmail1"> Enter your name </label> <input
										type="text" name="name" class="form-control form-control-sm"
										id="exampleInputEmail1" aria-describedby="emailHelp">
								</div>

								<div class="form-group">
									<label for="exampleInputEmail1"> Enter Email address </label> <input
										type="email" name="email" class="form-control form-control-sm"
										id="email" aria-describedby="emailHelp">
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1"> Enter Your Number </label> <input
										type="number" name="number"
										class="form-control form-control-sm" id="exampleInputEmail1"
										aria-describedby="emailHelp">
								</div>

								<div class="form-group">
									<label for="exampleInputPassword1">Enter Password </label> <input
										type="password" name="password"
										class="form-control form-control-sm"
										id="password">
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Confirm Password </label> <a
										href="#" style="float: right; font-size: 12px;"> Forgot
										password? </a> <input type="password" name="cpassword"
										class="form-control form-control-sm"
										id="cpassword">
								</div>
								<button type="submit" class="btn btn-primary btn-block">
									Sign up</button>

								<div class="sign-up">
									Already have ? <a href="login"> Click here to login </a>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="footer.jsp"%>
		
</body>
</html>