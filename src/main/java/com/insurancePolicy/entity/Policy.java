package com.insurancePolicy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Policy")
public class Policy {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long policyId;
private String 	policyName;
private Integer policyAmount;
private Integer policyTenure;
private Integer benefit;
public Long getPolicyId() {
	return policyId;
}
public void setPolicyId(Long policyId) {
	this.policyId = policyId;
}
public String getPolicyName() {
	return policyName;
}
public void setPolicyName(String policyName) {
	this.policyName = policyName;
}
public Integer getPolicyAmount() {
	return policyAmount;
}
public void setPolicyAmount(Integer policyAmount) {
	this.policyAmount = policyAmount;
}
public Integer getPolicyTenure() {
	return policyTenure;
}
public void setPolicyTenure(Integer policyTenure) {
	this.policyTenure = policyTenure;
}
public Integer getBenefit() {
	return benefit;
}
public void setBenefit(Integer benefit) {
	this.benefit = benefit;
}

}
