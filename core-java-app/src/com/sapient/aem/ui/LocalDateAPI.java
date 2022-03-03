package com.sapient.aem.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateAPI {

	public static void main(String[] args) {
		
		LocalDate now=LocalDate.now();
		System.out.println(now);
		LocalDate birth = LocalDate.of(1998, 1, 14);
		System.out.println(birth);
		LocalTime n=LocalTime.now();
		System.out.println(n);
		LocalDateTime h=LocalDateTime.now();
		System.out.println(h);
		LocalDate id=LocalDate.of(1998, 8, 14);
		System.out.println(id);
		LocalDateTime hiredate= LocalDateTime.of(2019, 11, 1,13, 45, 30);
		//2019-11-01T13:45:30
		System.out.println(hiredate);
		
		System.out.println("Present date and time: "+LocalDateTime.now());
		
		LocalDate independeceDay= LocalDate.of(1947, 8, 15);
		
		Period period= independeceDay.until(now);
		System.out.println(period.getYears()+" years,"+period.getMonths()+" months,"+period.getDays()+" days");
	
		System.out.println("Conversions..");
		System.out.println("String to LocalDate..");
		try {
			String someDateAsString= "1994-11-06";
			LocalDate someDate= LocalDate.parse(someDateAsString);
			System.out.println(someDate);
			String someDateAsString1= "06/11/1994";
			DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate someDate1= LocalDate.parse(someDateAsString1, formatter);
			System.out.println(someDate1);
			
		}catch(DateTimeParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("LocalDate to String..");
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String todayAsString= now.format(formatter);
		System.out.println(todayAsString);
	}
}
