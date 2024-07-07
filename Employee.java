package com.mainapp;


import java.util.Map;

public class Employee {
	

private String url;
private Map<String,Account> accinfo;
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public Map<String, Account> getAccinfo() {
	return accinfo;
}
public void setAccinfo(Map<String, Account> accinfo) {
	this.accinfo = accinfo;
}
@Override
public String toString() {
	return "Employee [url=" + url + ", accinfo=" + accinfo + "]";
}





}
	
