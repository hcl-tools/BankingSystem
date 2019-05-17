<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" description="dom">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Transfer Funds</title>
</head>
<body>

	<header>
		<h2>ABC Retail Banking - Customer Portal</h2>
		<nav>
			<ul>
				<li><a href="MyAccounts.jsp">My Accounts</a></li>
				<li class="active"><a href="TransferFunds.jsp">Transfer Funds</a></li>
				<li><a href="CreateAccountCustomer.jsp">Open New Account</a></li>				
				<li><a href="UpdateContactDetails.jsp">Update Details</a></li>
				<li><a href="Login.jsp">Logout</a></li>
			</ul>
		</nav>
	</header>

			<!-- 
			User username = (User) request.getAttribute("1"); 
			   Account selectedAccount = (Account) request.getAttribute("2"); %>
		 -->
	
		<article>
			<section>

			<form action="AppController" method="post">
				<h1>Transfer Funds</h1>
				<h2>From</h2>
				<p><label>Account:</label>
					<select>
						<option name="default" value="savings">== Please select ==</option>
						<!--  get user accounts, for each set name and value as type & maybe ACN -->
						<option name="savings" value="savings">savings</option>
						<option name="cheque" value="cheque">cheque</option>
						<option name="current" value="current">current</option>
					</select>
				</p>
				<p><label>Amount: </label><input type="text" name="amount" min="4"></p>
				<p><label>Description: </label><input type="text" name="id" min="1"></p>
				
				<h2>To</h2>
				<p><label>ACN:</label><input type="text" name="toAcn" min="2"></p>
				<p><label>BSB:</label><input type="text" name="toBsb" min="2"></p>
				
				<input type="hidden" name="page" value="transferFunds">
				<p><label></label><input type="submit" value="Transfer"><input type="reset" value="Reset"></p>
			</form>
	
			</section>	
		</article>
	

</body>
</html>