package com.mainapp.dao;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import javax.annotation.PostConstruct;
import com.mainapp.dto.EmployeeDTO;
import com.mainapp.model.Employee;

public class Crud {
	
	private List<Employee> list;
	public List<Employee> getList() {
		return list;
	}

	@PostConstruct
	public void myCrudInit() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("P1->ArrayList\nP2->LinkedList");
		int choice=scanner.nextInt();
		if(choice==1) {
			list=new ArrayList<Employee>();
		}else {
			list=new LinkedList<Employee>();
		}
	}
   
	public void saveMyData(EmployeeDTO dto) {
		Employee employee = new Employee(dto.getEid(), dto.getEname(), dto.getEaddress(), dto.getEsalary());
		list.add(employee);
		System.out.println("DATA INSERTED");
	}
	
   public List<Employee> readMyData() {
		return list;
   }
}
