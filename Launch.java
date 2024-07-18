package com.mainapp;



import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mainapp.controller.MyController;
import com.mainapp.dto.EmployeeDTO;
public class Launch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter eid");
		int eid=scanner.nextInt();
		
		System.out.println("Enter ename");
		String ename=scanner.next();
		
		System.out.println("Enter eaddress");
		String eaddress=scanner.next();
		
		System.out.println("Enter esalary");
		int salary=scanner.nextInt();
		
		//DTO MODEL
		EmployeeDTO employeeDTO = new EmployeeDTO(eid, ename, eaddress, salary);
		
		MyController controller=  (MyController) ac.getBean("controller");
		controller.doPost(employeeDTO);
	}
}
