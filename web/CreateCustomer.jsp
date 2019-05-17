<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" description="dom">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Create customer</title>
</head>
<body>
	<header>
		<h2>ABC Retail Banking - Banker Portal</h2>
	</header>
	
	<article>
		<h1>Add New Customer</h1>
		
		<form action="/AppController" method="post">
			<p><label>Name: </label><input type="text" name="name" min="2"></p>
			<p><label>Address: </label><input type="text" name="address" min="5"></p>
			<p><input type="submit" value="create"></p>
		</form>
		
	</article>
	
</body>
</html>