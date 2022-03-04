package com.sapient.aem.service;

public class RunnabeImpl implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		
		System.out.println("End of run() method");
		
	}

}
