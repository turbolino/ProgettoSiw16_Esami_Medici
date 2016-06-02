<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link rel="stylesheet" href="bootstrap.css" type="text/css" />

</head>
<body>
	<h1>Login</h1>
	<form action="login.do" method="POST">
		<p>
			Username: <input type="text" name="username" />
		</p>
		<p>
			Password: <input type="password" name="password" />
		</p>
		<p>
			<input type="reset" value="Reimposta" />
		</p>
		<p>
			<input type="submit" value="Login" name="login" />
		</p>
	</form>
</body>
</html>
