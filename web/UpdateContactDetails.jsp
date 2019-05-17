<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" description="dom">

<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Update contact details</title>
</head>
<body>
	<header>
		<h2>ABC Retail Banking - Customer Portal</h2>
		<nav>
			<ul>
				<li><a href="MyAccounts.jsp">My Accounts</a></li>
				<li><a href="TransferFunds.jsp">Transfer Funds</a></li>
				<li><a href="CreateAccountCustomer.jsp">Open New Account</a></li>
				<li class="active"><a href="UpdateContactDetails.jsp">Update Details</a></li>
				<li><a href="Login.jsp">Logout</a></li>
			</ul>
		</nav>
	</header>

	<article>
		
		
		<section>
			<h1>Update Details</h1>
			<form action="/AppController" method="post">
				<p><label>Name: </label><input type="text" name="name" min="2"></p>
				<p><label>Address: </label><textarea name="address" ></textarea></p>
				<input type="hidden" name="page" value="updateContactDetails">
				<p><label></label><input type="submit" value="Update"><input type="reset" value="Reset"></p>
			</form>
		</section>
	</article>
	
</body>
</html>