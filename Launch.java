package com.mainapp;
public class Launch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Account account = new Account();
		
		Employee emp = new Employee(account);
		emp.setAccount(account);
		emp.printDetails();
		
	}

}
