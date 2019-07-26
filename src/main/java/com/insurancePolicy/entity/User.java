package com.insurancePolicy.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long userId;
private String userName;
private Integer age;
private String address;

@OneToOne
private Policy policy;

public Long getUserId() {
	return userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Policy getPolicy() {
	return policy;
}

public void setPolicy(Policy policy) {
	this.policy = policy;
}

}
