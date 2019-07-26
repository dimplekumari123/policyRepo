package com.insurancePolicy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurancePolicy.entity.Policy;
import com.insurancePolicy.service.PolicyService;


@RestController
@RequestMapping("/policy")
public class PolicyController {
	@Autowired
	PolicyService policyService;

	@GetMapping("/getAllPolicy")
	public List<Policy> getAllPolicy() {
		return policyService.listPolicy();
	}
	
	
	@GetMapping("/policyDetail/{id}")
	public Policy getDetailedPolicy(@PathVariable Long id)
	{
		
		
		return policyService.showPolicyDetails(id);
	}
	
}
