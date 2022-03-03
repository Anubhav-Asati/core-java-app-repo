package com.sapient.aem.ui;

import com.sapient.aem.bean.Employee;
import com.sapient.aem.bean.insuranceScheme;
import com.sapient.aem.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeServiceImpl emp=new EmployeeServiceImpl();
		Employee emp1 = emp.getEmpDetails();
		String scheme = emp.insuranceScheme(emp1.getDesignation(), emp1.getSalary());
		Employee Person = new Employee(emp1.getId(),emp1.getName(),emp1.getSalary(),emp1.getDesignation());
		emp.EmpDetails(Person);
		System.out.println("Employee insuranceScheme:"+scheme);
		emp1.setInsuranceScheme(insuranceScheme.SCHEMEA);
		System.out.println("insuranceScheme: "+emp1.getScheme());
		emp1.setInsuranceScheme(insuranceScheme.SCHEMEB);
		System.out.println("insuranceScheme: "+emp1.getScheme());
		emp1.setInsuranceScheme(insuranceScheme.SCHEMEC);
		System.out.println("insuranceScheme: "+emp1.getScheme());
		emp1.setInsuranceScheme(insuranceScheme.NOSCHEME);
		System.out.println("insuranceScheme: "+emp1.getScheme());
		
		for(insuranceScheme is: insuranceScheme.values()) {
			System.out.println(is.name()+","+is.ordinal());
		}
		
		

	}

}
