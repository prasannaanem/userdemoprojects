package com.userdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userdemo.entity.User;
import com.userdemo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User saveUsers(@RequestBody User user) {
		
		return userService.saveUser(user);
	}

	@GetMapping("/getall")
	public List<User> getAllUsers(){
		return userService.getUsersAll();
	}
}
