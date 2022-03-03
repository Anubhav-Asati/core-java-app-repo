package com.sapient.aem.ui;

import java.util.Scanner;

import com.sapient.aem.bean.Employee;
import com.sapient.aem.service.EmployeeService;
import com.sapient.aem.service.EmployeeServiceImpl;
import com.sapient.aem.service.insuranceScheme;

public class EmployeeMain {
	
	
	private static final Integer size=100;
	private static Employee employees[]= new Employee[size];
	private static Scanner sc=new Scanner(System.in);
	private static EmployeeService service= new EmployeeServiceImpl();
	
	public static void main(String[] args) {
		
		System.out.println("Enter number of employees upto maximum "+size);
		int nemps=Integer.parseInt(sc.nextLine());
		for(int i=0;i<nemps;i++) {
			employees[i]=service.getEmpDetails();
		}
		System.out.println("All Employee Details");
		//for(int i=0;i<nemps;i++) {
		//	service.EmpDetails(employees[i]);
		//}
		for(Employee e:employees) {
			service.EmpDetails(e);
		}
	}
}