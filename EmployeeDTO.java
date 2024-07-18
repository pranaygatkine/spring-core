package com.mainapp.dto;

public class EmployeeDTO {
	
	private int eid;
	private String ename;
	private String eaddress;
	private int esalary;
	
	public EmployeeDTO(int eid, String ename, String eaddress, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public int getEsalary() {
		return esalary;
	}
}
