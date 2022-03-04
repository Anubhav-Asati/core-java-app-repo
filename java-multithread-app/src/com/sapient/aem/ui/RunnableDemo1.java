package com.sapient.aem.ui;

import com.sapient.aem.service.MyThread;

public class RunnableDemo1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		Runnable runnable=()->{
			try {
				Thread.sleep(12);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread());
			System.out.println("End of run()");
			
		};
		System.out.println(Thread.currentThread());
		Thread t1= new MyThread("worker-1");
		t1.start();
	
		//try {
//			//making the main() to sleep/pause for 10 ms
//			Thread.sleep(10);
//		} catch (InterruptedException e) {			
//			e.printStackTrace();
//		}	
		
//		try {
//			//join me, worker thread telling main thread to join me
//			t1.join();
//		} catch (InterruptedException e) {			
//			e.printStackTrace();
//		}
		
		
		try {
			//join me, worker thread telling main thread to join me
			//t1.join(15);
			t1.join(1000*60);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}

		
		System.out.println("End of main()");
	}
}
