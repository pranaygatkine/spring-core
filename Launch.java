package com.mainapp;



import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Launch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		

	
		Employee emp = (Employee) ac.getBean("emp");
		
		System.out.println(emp.getDriverName().getClass());
		System.out.println(emp);
		
	
		
	}

}
