package com.insurancePolicy.service;

import java.util.List;

import com.insurancePolicy.entity.Policy;

public interface PolicyService {
	
	
	
	public List<Policy> listPolicy();
	
	public Policy showPolicyDetails(Long id);
}
