package com.gopi.restapp.serviceimpl;

import org.springframework.stereotype.Service;

import com.gopi.restapp.model.User;
import com.gopi.restapp.repository.UserRepository;
import com.gopi.restapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {


	UserRepository userRepository;
    

    public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public String saveUser(User user) {
        return userRepository.save(user);
    }
}
