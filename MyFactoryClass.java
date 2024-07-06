package com.mainapp;

public class MyFactoryClass {
	
	
	public  Employee getObj1(){
		
		System.out.println("BUS_LOGIC 1");
		return new Employee();
		}

public  Employee getObj2(){
		
		System.out.println("BUS_LOGIC2");
		return new Employee();
		}

}
