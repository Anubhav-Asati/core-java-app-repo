package com.sapient.aem.bean;

import com.sapient.aem.service.insuranceScheme;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	private String designation;
	private insuranceScheme scheme;
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, Double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Employee(insuranceScheme scheme) {
		super();
		this.scheme=scheme;
	}
	public insuranceScheme getScheme() {
		return scheme;
	}
	public void setInsuranceScheme(insuranceScheme scheme) {
		this.scheme=scheme;
		
	}
}
	