package com.hibernate.entities;

public class Employee {

	private int employeeId;
	
	private String name;

	public Employee(int id, String name) {
		super();
		this.employeeId = id;
		this.name = name;
	}

	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int id) {
		this.employeeId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
