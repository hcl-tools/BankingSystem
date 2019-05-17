package com.service;

import com.bean.User;
import com.dao.UserDao;
import com.dao.UserDaoImpl;

/**
 * 
 * @author Dom R
 *
 */
public class UserManagerImpl implements UserManager {

	UserDao userDao = new UserDaoImpl();
	User foundUser = new User();
	
	@Override
	public User sanitiseReturn(User user) {
		user.setPassword("");
		return user;
	}
	
	@Override
	public User validateUser(User user) {
		if ((foundUser = userDao.findUser(user)) != null) {
			System.out.println("FUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCK: " + foundUser.getUserName());
			if (foundUser.getUserId() == user.getUserId()
					&& foundUser.getPassword().equals(user.getPassword())) {
					user = foundUser;
				}
		}
		return sanitiseReturn(user); // if includes full name minus password, password is validated
	}

	@Override
	public User createUser(User user) {
		User createdUser = userDao.createUser(user);
		return createdUser;
	}

	@Override
	public User updateUser(User user) {
		User updatedUser = userDao.updateUser(user);
		return updatedUser;
	}

	@Override
	public User findUser(User user) {
		if ((foundUser = userDao.findUser(user)) != null) {
			user = foundUser;
		}
		return sanitiseReturn(user);
	}
}
