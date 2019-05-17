package com.dao;

import com.bean.User;

/**
 * 
 * @author Dom R
 *
 */
public interface UserDao {

	User createUser(User user);
	
	User updateUser(User user);
	
	User findUser(User user);
	
}
