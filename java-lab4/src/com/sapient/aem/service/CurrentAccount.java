package com.sapient.aem.service;

public class CurrentAccount extends Account {
	
	public static final double OVERDRAFT_LIMIT=500000.0;
	
	public CurrentAccount() {
		
	}
	
	
	public CurrentAccount(Double balance, Person accHolder) {
		super(balance, accHolder);
	
	}


	@Override
	public void withdraw(Double amount) {
		
		if(this.getBalance()<=-500000.0) {
			System.out.println("Already exceeded overdraft limit of 500000.00");
		}else if( (this.getBalance()+ amount > OVERDRAFT_LIMIT )) {
			System.out.println("Exceeding overdraft limit of 500000.00");
		}else {
			//this.balance=this.balance-amount;
			this.setBalance(this.getBalance()-amount);
		}
	}
}