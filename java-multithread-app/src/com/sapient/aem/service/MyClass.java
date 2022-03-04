package com.sapient.aem.service;

public class MyClass {
	
	/*
	 * Error, synchronized can be applied only for methods or blocks of a method
	 * not for instance variables. To acheive synchronized effect on instance
	 * variables, use keyword, volatile
	 */

	
	//synchronized private String message; 
	
	volatile private String message;
	
	
	
	

}
