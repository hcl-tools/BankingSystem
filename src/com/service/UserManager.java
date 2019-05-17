package com.service;

import com.bean.User;

/**
 * 
 * @author Dom R
 *
 */
public interface UserManager {

	User sanitiseReturn(User user);
	
	User createUser(User user);
	
	User updateUser(User user);
	
	User findUser(User user);
	
	User validateUser(User user);
	
}
