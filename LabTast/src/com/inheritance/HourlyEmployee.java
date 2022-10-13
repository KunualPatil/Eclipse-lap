package com.inheritance;

public class HourlyEmployee extends Employee {

	private double  perhour;
	private int time;
	
	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(double perhour, int time) {
		super();
		this.perhour = perhour;
		this.time = time;
	}

	public double getPerhour() {
		return perhour;
	}

	public void setPerhour(double perhour) {
		this.perhour = perhour;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public void calculateSalary(int numOfHours) {
		// initialize empSalary
		this.Salary = numOfHours * 200;
	}
	@Override
	public String toString() {
		return "HourlyEmployee [perhour=" + perhour + ", time=" + time + ", toString()=" + super.toString() + "]";
	}
	
	
}

