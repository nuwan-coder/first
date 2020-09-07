package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.model.User;
import com.test.demo.service.UserService;

@RestController
public class HomeController {

	@Autowired
	UserService userService;
	
	@ResponseBody
	@GetMapping("/test")
	public String test() {
		return "hello";
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
}
