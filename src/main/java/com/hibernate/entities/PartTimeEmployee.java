package com.hibernate.entities;

public class PartTimeEmployee extends Employee{

	private double payPerHour;
	
	private String contractPeriod;

	public PartTimeEmployee(int id, String name, double payPerHour, String contractPeriod) {
		super(id, name);
		this.payPerHour = payPerHour;
		this.contractPeriod = contractPeriod;
	}

	public PartTimeEmployee(int id, String name) {
		super(id, name);
	}

	public PartTimeEmployee() {
	}

	public double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

	public String getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	
}
