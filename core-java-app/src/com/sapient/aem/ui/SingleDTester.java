package com.sapient.aem.ui;

import java.util.Scanner;


public class SingleDTester {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		System.out.println("Initiaization ....");
		String courses[] = {"Java","Java EE","Javascript","HTML 5","CSS 3"};
		
		System.out.println("for each loop...");
		for(String c: courses) {
			System.out.println(c);
		}		
		System.out.println("Accepting input...");
		System.out.println("Enter number of courses..");
		int ne= scanner.nextInt();
		String course[]= new String[ne];
		for(int i=0;i<course.length;i++) {
			System.out.println("Enter course: "+ (i+1));
			course[i]=scanner.nextLine();
		}		
		System.out.println("Course list...");
		for(String s: course) {
			System.out.println(s);
		}
	}

}

		
		

	

