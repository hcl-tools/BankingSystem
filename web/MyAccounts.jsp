<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" description="dom">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Customer Dashboard</title>
</head>
<body>

	<header>
		<h2>ABC Retail Banking - Customer Portal</h2>
		<nav>
			<ul>
				<li class="active"><a href="MyAccounts.jsp">My Accounts</a></li>
				<li><a href="TransferFunds.jsp">Transfer Funds</a></li>
				<li><a href="CreateAccountCustomer.jsp">Open New Account</a></li>				
				<li><a href="UpdateContactDetails.jsp">Update Details</a></li>
				<li><a href="Login.jsp">Logout</a></li>
			</ul>
		</nav>
	</header>
		
	<section>
		<article>
		
			<!--  get all Customer Accounts, use conditional logic of what to display based on what select -->
			
			<!--  User username = (User) request.getAttribute("1"); %>  
			 Account selectedAccount = (Account) request.getAttribute("1"); 
			<p>< out.print("Welcome " + user.getUsername()); ></p>-->
			
			<h1>My Accounts</h1>
			<form action="/AppController" method="post">
				<p><label>Account: </label>
					<select>
						<option name="default" value="default">== Please select ==</option>
						<!--  get user accounts, for each set name and value as type & maybe ACN -->
						<option name="savings" value="savings">savings</option>
						<option name="cheque" value="cheque">cheque</option>
						<option name="current" value="current">current</option>
					</select>
				</p>
				<input type="hidden" name="page" value="myAccounts">
				<p><label></label><input type="submit" value="View"><input type="reset" value="Reset"></p>
			</form>	
			
			<h2>Summary</h2>
			<table>
				<tr><th>ACN</th><th>BSB</th><th>Balance</th></tr>
				<tr><td>12345678</td><td>123456</td><td>$1234.56</td></tr>
				<tr><td><%  %></td><td><%  %></td><td><%  %></td></tr>
			</table>
			
			<h2>Transaction history</h2>
			<table>
				<tr><th>Incoming</th><th>Outgoing</th></tr>
				<%
					// for each transaction create a new row
				%>
			</table>
		</article>
	
	</section>	
</body>
</html>