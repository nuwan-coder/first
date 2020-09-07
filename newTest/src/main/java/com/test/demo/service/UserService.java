package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.demo.model.User;
import com.test.demo.repository.UserRepository;

@Component
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User addUser(User user) {
		return userRepository.save(user);
	}
}
