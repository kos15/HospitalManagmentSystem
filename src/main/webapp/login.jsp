<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1 style="allign:center">Login</h1>

	<form action="login" method="post">

		Username<input type="text" name="username" value="" required> <br>

		Password<input type="password" name="password" value="" required> <br>

		<input type="submit" name="submit" value="submit" required><br>

	</form>
</body>
</html>