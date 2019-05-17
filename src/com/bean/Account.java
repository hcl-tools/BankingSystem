package com.bean;

public class Account {
	
	private String accountType;
	 
	private Transaction transaction;
	private int accountNumber;
	private User user;
	private int accountBalance;
	private int accountMinBalance;
	private int accountBSB;
	
	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Account() {}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getAccountMinBalance() {
		return accountMinBalance;
	}

	public void setAccountMinBalance(int accountMinBalance) {
		this.accountMinBalance = accountMinBalance;
	}

	public int getAccountBSB() {
		return accountBSB;
	}

	public void setAccountBSB(int accountBSB) {
		this.accountBSB = accountBSB;
	}
	
	
	
	
}
