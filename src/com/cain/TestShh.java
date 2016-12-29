package com.cain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cain.domain.User;
import com.cain.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestShh {

	@Autowired
	private UserService userService;
	@Test
	public void test01(){
		User user = new User();
		user.setAge(12);
		user.setPassword("9999");
		user.setUsername("jianwei");
		
		userService.register(user);
	}
}
