package com.inheritance;

public class TestSalary {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HourlyEmployee H1 = new  HourlyEmployee(200,12);
		System.out.println(H1);
		
		System.out.println("Employee Id is : " + H1.getId());
		System.out.println("Employee Name is : " + H1.getName());
		System.out.println("Employee Salary in a day is : " + H1.getSalary());
		
		
		SalariedEmployee s1 = new SalariedEmployee(26,45000);
		System.out.println(s1);
		
		System.out.println("Employee Id is : " + s1.getId());
		System.out.println("Employee Name is : " + s1.getName());
		System.out.println("Employee Salary in a day is : " + s1.getSalary());
		
	}

}


