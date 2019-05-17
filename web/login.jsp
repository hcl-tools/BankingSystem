<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" description="dom">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Login</title>
</head>
<body>
	<header>
		<h2>ABC Retail Banking</h2>
	</header>
	

	<section>
	<h1>Login</h1>
	<form action="/AppController" method="post">
		<p><label>Username:</label><input type="text" name="userName"></p>
		<p><label>Password:</label><input type="password" name="password"></p>
		<input type="hidden" name="page" value="login">
		<p><label></label><input type="submit" value="login"><input type="reset" value="reset"></p>
	</form>
	</section>
</body>
</html>