package com.inheritance;

public class SalariedEmployee extends Employee {

	private int monthdays;
	private int salary;

	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int monthdays, int salary) {
		super();
		this.monthdays = monthdays;
		this.salary = salary;
	}

	public int getMonthdays() {
		return monthdays;
	}

	public void setMonthdays(int monthdays) {
		this.monthdays = monthdays;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [monthdays=" + monthdays + ", salary=" + salary + ", toString()=" + super.toString()
				+ "]";
	}
	
}
