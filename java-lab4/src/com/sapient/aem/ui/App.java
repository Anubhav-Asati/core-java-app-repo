package com.sapient.aem.ui;

import com.sapient.aem.service.Account;
import com.sapient.aem.service.CurrentAccount;
import com.sapient.aem.service.Person;
import com.sapient.aem.service.SavingsAccount;

public class App {

	public static void main(String[] args) {
		
		//Person person1=new Person("Smith",25.0f);
		//Account account1=new Account(2000.0,person1);
		//Person person2=new Person("kathy",21.0f);
		//Account account2=new Account(3000.0,person2);
		
		//account1.deposit(2000.0);
		//account2.withdraw(2000.0);
		//System.out.println("Current balance of"+account1.getAccHolder().getName()+"is"+account1.getCurrentBalance());
		//System.out.println("Current balance of"+account2.getAccHolder().getName()+"is"+account2.getCurrentBalance());
        
		
		Person person1=new Person("Smith",25.0f);
		Person person2=new Person("kathy",21.0f);
		Account account[]=new Account[2];
		account[0]=new SavingsAccount(50000.0,person1);
		account[1]=new CurrentAccount(800000.0,person2);
		account[1].withdraw(500000.0);
		System.out.println(account[1].getBalance());
		account[1].withdraw(500000.0);
		System.out.println(account[1].getBalance());
		account[1].withdraw(250000.0);
		System.out.println(account[1].getBalance());
		account[1].withdraw(100000.0);
		System.out.println(account[1].getBalance());

	}
}
