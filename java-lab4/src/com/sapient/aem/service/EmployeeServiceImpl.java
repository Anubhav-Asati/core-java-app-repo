package com.sapient.aem.service;

import java.util.Scanner;

import com.sapient.aem.bean.Employee;
import com.sapient.aem.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	Scanner sc=new Scanner(System.in);

	@Override
	public Employee getEmpDetails() {

		String designation;
		String insuranceScheme="";
		System.out.println("Enter employee id:");
		int id=sc.nextInt();
		System.out.println("Enter employee name");
		String name=sc.next();
		System.out.println("Enter employee Salary");
		double salary=sc.nextDouble();
		if(salary<5000) {
			designation="clerk";
		}
		else if(salary>5000&&salary<20000) {
			designation="System Associate";
		}
		else if(salary>20000&&salary<40000) {
			designation="Programmer";
		}
		else {
			designation="Manager";
		}

		Employee emp=new Employee(id,name,salary,designation);
		return emp;

	}

	@Override
	public String insuranceScheme(String designation, Double Salary) {

		String scheme;
		if(designation=="Clerk") {
			scheme="No Scheme";
		}
		else if(designation=="System Associate") {
			scheme="Scheme C";
		}
		else if(designation=="Programmer") {
			scheme="Scheme B";
		}
		else {
			scheme="Scheme A";
		}
		return scheme;
	}

	@Override
	public void EmpDetails(Employee emp) {

		System.out.println("Employee id "+emp.getId());
		System.out.println("Employee name "+emp.getName());
		System.out.println("Employee salary "+emp.getSalary());
		System.out.println("Employee Designation "+emp.getDesignation());
	}
}