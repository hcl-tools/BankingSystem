<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" description="dom">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Open new account</title>
</head>
<body>

	<header>
		<h2>ABC Retail Banking - Customer Portal</h2>
		<nav>
			<ul>
				<li><a href="MyAccounts.jsp">My Accounts</a></li>
				<li><a href="TransferFunds.jsp">Transfer Funds</a></li>
				<li class="active"><a href="CreateAccountCustomer.jsp">Open New Account</a></li>
				<li><a href="UpdateContactDetails.jsp">Update Details</a></li>
				<li><a href="Login.jsp">Logout</a></li>
			</ul>
		</nav>
	</header>
	
	<article>
	

		
		<% 
			
		
		%>
		
		<!-- <p><label>Customer id: </label><input></p> 
		  <p><label>BSB: </label><input type="text" name="bsb" min="6" maxlength="6"></p>
		<p><label>ACN: </label><input type="text" name="acn" min="8" maxlength="8"></p>  -->
		
		<section>
			<h1>Open New Account</h1>
			<form action="/AppController" method="post">
				<p><label>Account type: </label><input type="text" name="amount" min="3"></p>
				<p><label>Initial Desposit:</label><input type="text" name="amount" min="3"></p>
				<input type="hidden" name="page" value="createAccountCustomer">
				<p><label></label><input type="submit" value="Create"><input type="reset" value="Reset"></p>
			</form>
			
		</section>

	</article>
	
</body>
</html>