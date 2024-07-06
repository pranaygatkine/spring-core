package com.mainapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{
	static {
		System.out.println("BEAN LOADING");
	}
	private Employee() {
		System.out.println("BEAN INSTANTIATION");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("RES-ALL: init");	}
	
     public void info() {
		System.out.println("CUSTOM METHOD");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("RES-DEALL: Destroy");
		
	}
	
	
}
