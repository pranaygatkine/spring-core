package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	static {
		System.out.println("BEAN LOADING");
	}
	private Employee() {
		System.out.println("BEAN INSTANTIATION");
	}
@PostConstruct
	public void  myAnnoInit() {
		System.out.println("RES-ALL: init");

		
	}
	
	public void info() {
		System.out.println("CUSTOM METHOD");
		
	}
	@PreDestroy
	public void myAnnoDestroy() {
		System.out.println("RES-DEALL: Destroy");
	}
}
