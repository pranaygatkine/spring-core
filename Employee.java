package com.mainapp;


public class Employee {
	
	public Employee() {
		System.out.println("BEAN INSTANTIATION");
	}
	
	public static Employee getObj(){
		
		System.out.println("BUS_LOGIC");
		return new Employee();
		
		
	}

     public void info() {
		System.out.println("CUSTOM METHOD");
		
	}
	
}
