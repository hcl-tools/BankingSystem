package com.bean;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * 
 * @authors Dom R
 *
 */
public class User {

	private int userId;
	private String firstName;
	private String lastName;
	private String address;
	private String userName;
	private String password;
	private boolean isCustomer;
	
	public User() {}
	
	public User(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public User(String firstName, String lastName, String address, String userName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isCustomer() {
		return isCustomer;
	}

	public void setCustomer(boolean customer) {
		isCustomer = customer;
	}
}

