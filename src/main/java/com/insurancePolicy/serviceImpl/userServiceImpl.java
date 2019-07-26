package com.insurancePolicy.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurancePolicy.entity.User;
import com.insurancePolicy.repository.UserRepository;
import com.insurancePolicy.service.UserService;
@Service
public class userServiceImpl implements UserService {
@Autowired
UserRepository userRepo;
	@Override
	public User createUser(User user) {
	return	userRepo.save(user);
		
	}

}
