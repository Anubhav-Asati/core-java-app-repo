package com.sapient.aem.service;

import com.sapient.aem.bean.Employee;

public interface EmployeeService {
	
	public abstract Employee getEmpDetails();
	public abstract insuranceScheme getInsuranceScheme(Employee emp);
	public abstract void EmpDetails(Employee emp);

}