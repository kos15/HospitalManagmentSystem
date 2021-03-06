<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
	<title>Hospital Login</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
	<!--===============================================================================================-->
	<style><%@include file="/vendor/bootstrap/css/bootstrap.min.css"%></style>
	<!--===============================================================================================-->
	<style><%@include file="/fonts/font-awesome-4.7.0/css/font-awesome.min.css"%></style>
	<!--===============================================================================================-->
	<style><%@include file="/vendor/animate/animate.css"%></style>
	<!--===============================================================================================-->
	<style><%@include file="/vendor/css-hamburgers/hamburgers.min.css"%></style>
	<!--===============================================================================================-->
	<style><%@include file="/vendor/select2/select2.min.css"%></style>
	<!--===============================================================================================-->
	<style><%@include file="/css/main.css"%></style>
	<style><%@include file="/css/util.css"%></style>
	<!--===============================================================================================-->
</head>

<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt>
					<img src="/images/img-01.png">
				</div>

				<form class="login100-form validate-form" action="login" method="post">
					<span class="login100-form-title">
						Member Login
					</span>

					<div class="wrap-input100 validate-input" data-validate="Username is required">
						<input class="input100" type="text" name="username" placeholder="Username">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-envelope" aria-hidden="true"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Password is required">
						<input class="input100" type="password" name="password" placeholder="Password">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-lock" aria-hidden="true"></i>
						</span>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Login
						</button>
					</div>


					<div class="text-center p-t-136">

					</div>
				</form>
			</div>
		</div>
	</div>




	<!--===============================================================================================-->
	<script type="text/javascript"><%@include file="/vendor/jquery/jquery-3.2.1.min.js"%></script>
	<!--===============================================================================================-->
	<script type="text/javascript"><%@include file="/vendor/bootstrap/js/popper.js"%></script>
	<script type="text/javascript"><%@include file="/vendor/bootstrap/js/bootstrap.min.js"%></script>
	
	<!--===============================================================================================-->
	<script type="text/javascript"><%@include file="/vendor/select2/select2.min.js"%></script>
	<!--===============================================================================================-->
	<script type="text/javascript"><%@include file="/vendor/tilt/tilt.jquery.min.js"%></script>
	<script>
		$('.js-tilt').tilt({
			scale: 1.1
		})
	</script>
	<!--===============================================================================================-->
	<script type="text/javascript"><%@include file="/js/main.js"%></script>
	
</body>
</html>