package com.cain.dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.cain.dao.UserDao;
import com.cain.domain.User;

public class UserDaoImpl implements UserDao {

	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(user);
	}

}
