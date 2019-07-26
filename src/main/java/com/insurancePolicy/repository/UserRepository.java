package com.insurancePolicy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurancePolicy.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
