package com.inheritance;


public class Employee {

	private int id;
	private String  name;
	private int age;
	protected int Salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return Salary;
	}

	// calculate empSalary
		public void calculateSalary(int timeDuration) {
			// initialize empSalary
			this.Salary = 0;
		}
		
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", Salary=" + Salary + "]";
	}
	
}
