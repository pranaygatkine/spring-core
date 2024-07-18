package com.mainapp.service;
import java.util.List;

import com.mainapp.dao.Crud;
import com.mainapp.dto.EmployeeDTO;
import com.mainapp.model.Employee;

public class MyService {
	
	private Crud crud;
	
	public void setCrud(Crud crud) {
		this.crud = crud;
	}

	public void myServiceSaveImpl(EmployeeDTO dto) {
		crud.saveMyData(dto);
	}
	
	public List<Employee> myServiceReadImpl() {
		return crud.readMyData();
	}
}
