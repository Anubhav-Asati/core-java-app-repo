package com.sapient.aem.ui;

import com.sapient.aem.service.RunnabeImpl;

public class RunnableDemo {
	

	public static void main(String[] args) {
		
		try {
			
			System.out.println(Thread.currentThread());
			Runnable runnable=new RunnabeImpl();
			Thread t1=new Thread(runnable,"worker-1");
			t1.start();
			Thread t2=new Thread(runnable,"worker-2");
			t2.start();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("End of main() method");
	}
}
