package com.mainapp.controller;
import com.mainapp.dto.EmployeeDTO;
import com.mainapp.service.MyService;
public class MyController {
	
	private MyService myService;
	public void setMyService(MyService myService) {
		this.myService = myService;
	}

	public void doPost(EmployeeDTO dto) {
		
		myService.myServiceSaveImpl(dto);
		System.out.println(myService.myServiceReadImpl());
	}
}
