package com.mainapp;


import java.util.Map;

public class Employee {
	
private Account account;
private String url;
private Map<String,String> driverName;
public Account getAccount() {
	return account;
}
public void setAccount(Account account) {
	this.account = account;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public Map<String, String> getDriverName() {
	return driverName;
}
public void setDriverName(Map<String, String> driverName) {
	this.driverName = driverName;
}
@Override
public String toString() {
	return "Employee [account=" + account + ", url=" + url + ", driverName=" + driverName + "]";
}



}
	
