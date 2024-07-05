package com.mainapp;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		

		System.out.println("enter key");
		int key=sc.nextInt();
		
		Employee emp = (Employee) ac.getBean("emp");
		emp.info();
		
		Manager man = (Manager) ac.getBean("man");
		man.info();
		
		if(key==1212) {
			Student std = (Student) ac.getBean("std");
			std.info();
		}
		else
		{
			System.out.println("Wrong User");
		}
		
		
	}

}
