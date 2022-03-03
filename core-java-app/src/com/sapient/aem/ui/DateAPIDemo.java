package com.sapient.aem.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*Date API,Calendar,Gregorian Calendar*/

public class DateAPIDemo {
	
	public static void main(String[] args) {
		
		Date today=new Date();
		System.out.println(today);
		Date some=new Date(1000*60*60*24*365L);
		System.out.println(some);
		Long current=today.getTime();
		System.out.println(current);
		if(today.after(some)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		Calendar today1=Calendar.getInstance();
		System.out.println(today1);
		System.out.println(today1.getInstance());
		
		try {
			SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
			// to convert String to Date and vice-versa
			//SimpleDateFormat contains following methods
			// 1. parse() : convert String->Date
			//2. format(): convert Date->String			
			//convert String -> Date
			String hdate= "2019-10-15";			
			Date hiredate= simpleDateFormat.parse(hdate);
			System.out.println(hiredate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			//Date -> String
			SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yyyy");
			String todayAsString= sdf.format(today);
			System.out.println(todayAsString);
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}