package com.userdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userdemo.entity.User;
import com.userdemo.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	
	
	public List<User> getUsersAll(){
		
		return userRepository.findAll();
	}
	
	
	
}
