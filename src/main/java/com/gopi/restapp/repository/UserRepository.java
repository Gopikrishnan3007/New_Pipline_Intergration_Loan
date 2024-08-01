package com.gopi.restapp.repository;

import org.springframework.stereotype.Repository;

import com.gopi.restapp.model.User;

@Repository
public interface UserRepository{
    
	User findByUserName(String userName);
	
	String save(User user);
}
