package com.mainapp;


public class Employee {
	
	private Account account;
	
	public Employee() {
		
	}
	
	
	public Employee(Account account) {
		super();
		this.account = account;
	}
//constructor dependancy injection
	
	public void setAccount(Account account) {
		this.account = account;
	}

	// setter dependancy injection
	public void printDetails() {
		account.accountInfo();
		
	}


	
}
