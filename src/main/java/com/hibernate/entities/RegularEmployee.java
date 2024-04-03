package com.hibernate.entities;

public class RegularEmployee extends Employee{

	private double salary;
	
	private int bonus;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public RegularEmployee(int id, String name, double salary, int bonus) {
		super(id, name);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public RegularEmployee(double salary, int bonus) {
		this.salary = salary;
		this.bonus = bonus;
	}

	public RegularEmployee(int id, String name) {
		super(id, name);
	}

	public RegularEmployee() {
	}
	
	
}
