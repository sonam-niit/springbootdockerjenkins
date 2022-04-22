package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simplilearn.demo.SpringbootjpaCrudApplication;
import com.simplilearn.demo.entity.User;
import com.simplilearn.demo.service.UserService;

@SpringBootTest(classes = SpringbootjpaCrudApplication.class)
class SpringbootjpaCrudApplicationTests {

	@Autowired
	private UserService service;
	@Disabled
	@Test
	void addUser() {
		User u=new User();
		u.setName("Pooja");u.setEmail("pooja@gmail.com");u.setCountry("India");
		
		Assertions.assertNotNull(service.addUser(u));
	}
	@Test
	void getAll() {
		Assertions.assertEquals(2, service.getAllUser().size());
	}
}
