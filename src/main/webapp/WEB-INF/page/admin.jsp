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
<title>ADMIN</title>
<link rel="stylesheet" href="<c:url value="/resource/css/admin.css"/>">
</head>
<script type="text/javascript">
	setTimeout(function() {
		$('#hide').fadeOut('fast');
	}, 5000);
</script>

<body>
	<%@ include file="navbar.jsp"%>

	<div class=" container pt-5 mt-5" style="padding: 150px">
		<div class="global-container">
			<div class="card login-form">
				<div class="card-body">
					<h4 style="color: red;" id="hide" class="text-center">${failedAdmin}</h4>
					<h1 class="card-title text-center">Admin login here</h1>
					<div class="card-text">
						<form action="doadminregister" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1"> Enter Admin email </label> <input
									type="email" name="aemail" class="form-control form-control-sm"
									id="exampleInputEmail1" aria-describedby="emailHelp">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Admin Password
								</label> <a href="#" style="float: right; font-size: 12px;"> Forgot
									password? </a> <input type="apassword" name="apassword"
									class="form-control form-control-sm" id="exampleInputPassword1">
							</div>
							<button type="submit" class="btn btn-primary btn-block">
								lOG iN</button>

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