<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" description="dom">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Create Account</title>
</head>
<body>
	<header>
		<h2>ABC Retail Banking - Banker Portal</h2>
		<nav>
			<ul>
				<li><a href="BankerDashboard.jsp">My Dashboard</a></li>
				<li><a href="FindAccounts.jsp">Find Accounts</a></li>
				<li class="active"><a href="CreateAccountBanker.jsp">Open New Account</a></li>
				<li><a href="Login.jsp">Logout</a></li>
			</ul>
		</nav>
	</header>
	
	<article>
	<section>
		<h1>Create Account for Customer</h1>
		
		<form action="/AppController" method="post">
			<p><label for="type">Account type: </label>
				<select>
						<option name="default" value="default">== Please select ==</option>
						<!--  get user accounts, for each set name and value as type & maybe ACN -->
						<option name="savings" value="savings">savings</option>
						<option name="cheque" value="cheque">cheque</option>
						<option name="current" value="current">current</option>
					</select>
			</p>
			<p><label>Customer id:</label><input type="text" name="userId" min="1" maxlength="8"></p>
			<p><label>BSB: </label><input type="text" name="bsb" min="6" maxlength="6"></p>
			<p><label>ACN: </label><input type="text" name="acn" min="8" maxlength="8"></p>
			<p><label>Initial Amount:</label><input type="text" name="amount" min="3"></p>
			<input type="hidden" name="page" value="createAccountBanker">
			<p><label></label><input type="submit" value="Create"><input type="reset" value="Reset"></p>
			
		</form>
	</section>
	</article>
	
</body>
</html>