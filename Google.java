package com.mainapp;

import java.util.List;

public class Google {
	
	private int id;
	private String headOffice;
	private List<String> listOfServiceCountry;
	public Google(int id, String headOffice, List<String> listOfServiceCountry) {
		super();
		this.id = id;
		this.headOffice = headOffice;
		this.listOfServiceCountry = listOfServiceCountry;
		
		
	}
	@Override
	public String toString() {
		return "Google [id=" + id + ", headOffice=" + headOffice + ", listOfServiceCountry=" + listOfServiceCountry
				+ "]";
	}
}
