package com.insurancePolicy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurancePolicy.entity.User;
import com.insurancePolicy.serviceImpl.userServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
userServiceImpl userServiceImpl;
@PostMapping("/userdetails")
public String createUser(@RequestBody User user) {
	userServiceImpl.createUser(user);
	return "user is successfully created";
}
}
