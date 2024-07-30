package com.gopi.restapp.serviceimpl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gopi.restapp.model.User;
import com.gopi.restapp.serviceimpl.UserServiceImpl;

@SpringBootTest
class UserServiceImplTest {

	@Autowired
	UserServiceImpl userServiceImpl;
	

	@Test
	void testFindByUserNameFail() {
		assertNull(userServiceImpl.findByUserName("gopi112"));
	}


	
	@Test
	void testSaveUserFail() {
		User user = null;
		assertEquals("Fail to Add",userServiceImpl.saveUser(user));
	}

}
