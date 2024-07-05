package com.mainapp;

public class Employee {
	
	private int eid;
	private String ename;

	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	private Employee() {
		System.out.println("EMP INST");
		
	}
	public void info() {
		System.out.println("EMP INFO>>>>>>>>>>>>>");
		System.out.println("EID=" +eid);
		System.out.println("ENAME=" +ename);

	}
}
