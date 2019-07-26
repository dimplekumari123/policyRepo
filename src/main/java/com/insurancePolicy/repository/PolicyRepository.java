package com.insurancePolicy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurancePolicy.entity.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {

}
