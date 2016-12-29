package com.cain.service.impl;

import com.cain.dao.UserDao;
import com.cain.domain.User;
import com.cain.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	

}
