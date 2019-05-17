package com.bean;

import java.io.Serializable;
import java.util.List;

public class Customer extends User implements Serializable {

	private List<Account> accounts;
	
	public Customer() {
		super();
	}
	
	public Customer(String firstName, String lastName, String address) {
		super(firstName, lastName, address);
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
