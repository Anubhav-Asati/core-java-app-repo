package com.sapient.aem.service;

import com.sapient.aem.bean.Employee;

public interface EmployeeService {
	
	public abstract Employee getEmpDetails();
	public abstract String insuranceScheme(String designation,Double Salary);
	public abstract void EmpDetails(Employee emp);

}