package com.sapient.aem.service;

import java.util.Scanner;

import com.sapient.aem.bean.Employee;
import com.sapient.aem.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	Scanner sc=new Scanner(System.in);

	@Override
	public Employee getEmpDetails() {
		
		try {
			Employee emp=new Employee();
			System.out.println("Enter employee id:");
			emp.setId(Integer.parseInt(sc.nextLine()));
			System.out.println("Enter employee name");
			emp.setName(sc.next());
			System.out.println("Enter employee Salary");
			emp.setSalary(Double.parseDouble(sc.nextLine()));
			System.out.println("Enter Designation");
			emp.setDesignation(sc.nextLine());
			emp.setInsuranceScheme(this.getInsuranceScheme(emp));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public insuranceScheme getInsuranceScheme(Employee emp) {
		
		Double salary=emp.getSalary();
		String designation=emp.getDesignation();
		
		try {
			if((salary>5000&&salary<2000)&& designation.equalsIgnoreCase("System Associate")){
				return insuranceScheme.SCHEMEC;
			}
			else if((salary>=20000&&salary<40000)&& designation.equalsIgnoreCase("Programmer")){
				return insuranceScheme.SCHEMEB;
			}
			else if((salary>=40000)&& designation.equalsIgnoreCase("Manager")) {
				return insuranceScheme.SCHEMEA;
			}
			else if((salary<5000)&& designation.equalsIgnoreCase("Clerk")) {
				return insuranceScheme.NOSCHEME;
			}
			return insuranceScheme.NOSCHEME;
			}
		catch(Exception e) {
			e.printStackTrace();
			}
		return null;
	}

	@Override
	public void EmpDetails(Employee emp) {
		
		try {
			
			System.out.println("Employee id "+emp.getId());
			System.out.println("Employee name "+emp.getName());
			System.out.println("Employee salary "+emp.getSalary());
			System.out.println("Employee Designation "+emp.getDesignation());
			System.out.println("Employee insuranceScheme "+emp.getScheme());
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}