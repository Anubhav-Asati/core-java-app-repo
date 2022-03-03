package com.sapient.aem.ui;

import java.util.Arrays;
import java.util.Scanner;

public class MarksDetail {
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {

		Integer marks[]=new Integer[Integer.parseInt(sc.nextLine())];
		enterMarks(marks);
		showMarks(marks);
		Arrays.sort(marks);
		showMarks(marks);
		
		String str="Hello,Welcome,to,J2EE";
		String st[]=str.split(",");
		Arrays.sort(st);
				
	}
	private static void enterMarks(Integer[] marks) {
		for(int i=0;i<marks.length;i++) {
			marks[i]=Integer.parseInt(sc.nextLine());
		}
	}
	public static void showMarks(Integer[] marks) {

		for(Integer m:marks) {
			System.out.print(m+" ");
		}
	}

}
