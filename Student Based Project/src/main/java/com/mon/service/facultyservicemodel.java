package com.mon.service;

public class facultyservicemodel {
 private String department;
 private String name;
 private String email;
 private String  phone;

public facultyservicemodel(String department, String name, String email, String phone) {
	super();
	this.department = department;
	this.name = name;
	this.email = email;
	this.phone = phone;
}
public String getDepartment() {
	return department;
}

public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public String getPhone() {
	return phone;
}
}
