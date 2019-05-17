package com.dao;

import com.bean.Account;

public interface AccountDao {
	
	
	int create(Account account);
	void read(int id);
	boolean update(Account account);
	Account findAccountByNumber(int number);
	 
	
	
}


