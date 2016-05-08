package com.hashcoder.object;


class Employee implements Comparable {
	
	private int id;
	private String name;
	private int salary;
	private int age;
	
	public Employee(int id, String name, int salary, int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Employee e = (Employee) o; //cast the object of type Employee
		
		return this.salary-e.salary;
		
	}
	
	
}
