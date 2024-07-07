package com.mainapp;

import java.util.List;

public class Employee {
	


private Account accinfo;
private Car car;
private List<String> listofbooks;
public Account getAccinfo() {
	return accinfo;
}
public void setAccinfo(Account accinfo) {
	this.accinfo = accinfo;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public List<String> getListofbooks() {
	return listofbooks;
}
public void setListofbooks(List<String> listofbooks) {
	this.listofbooks = listofbooks;
}
@Override
public String toString() {
	return "Employee [accinfo=" + accinfo + ", car=" + car + ", listofbooks=" + listofbooks + "]";
}



}
	
