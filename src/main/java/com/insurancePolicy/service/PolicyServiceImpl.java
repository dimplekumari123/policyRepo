package com.insurancePolicy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurancePolicy.entity.Policy;
import com.insurancePolicy.repository.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	PolicyRepository policyRepo;

	@Override
	public List<Policy> listPolicy() {
		
		List<Policy> listPloy=policyRepo.findAll();

		return listPloy;
	}

	@Override
	public Policy showPolicyDetails(Long id) {

		Policy store=null;
		Optional<Policy> policyDet = policyRepo.findById(id);
		 
		if(policyDet.isPresent())
		{
			store=policyDet.get();
		}
		
		
		return store;
	}
}
