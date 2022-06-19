package com.lab.models;

public class Employee {

	private String firstName;
	private String lastName;
	
	public Employee(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// TODO Auto-generated constructor stub
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
