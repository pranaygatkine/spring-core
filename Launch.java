package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Google google = (Google) ac.getBean("google");
		System.out.println(google);
		
		Meta meta = (Meta) ac.getBean("meta");
		System.out.println(meta);
		
	}
}
