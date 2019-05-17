<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" description="dom">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Find account</title>
</head>
<body>
	<header>
		<h2>ABC Retail Banking - Banker Portal</h2>
		<nav>
			<ul>
				<li><a href="BankerDashboard.jsp">My Dashboard</a></li>
				<li class="active"><a href="FindAccounts.jsp">Find Accounts</a></li>
				<li><a href="CreateAccountBanker.jsp">Open New Account</a></li>
				<li><a href="Login.jsp">Logout</a></li>
			</ul>
		</nav>
	</header>
	
	<article>
	
		<!-- load with any found accounts -> if accounts display results, else just have search -->
	
		<section>
		
		<h1>Find Accounts by Customer</h1>
		<form action="/AppController" method="post">
			<p><label>Customer id: </label><input type="text" name="id" min="2"></p>
			<input type="hidden" name="page" value="findAccounts">
			<p><label></label><input type="submit" value="Find"><input type="reset" value="Reset"></p>
		</form>
		
		<h2>Search Results</h2>
		<table>
			<tr><th>Account</th><th>ACN</th><th>BSB</th><th>Balance</th></tr>
			<%
			
			%>	
			<tr><th>Savings</th><td>12345678</td><td>123456</td><td>$123456.00</td></tr>
			<tr><th>Cheque</th><td>12345678</td><td>123456</td><td>$123.00</td></tr>	
		
		</table>
		</section>
	</article>
	
</body>
</html>