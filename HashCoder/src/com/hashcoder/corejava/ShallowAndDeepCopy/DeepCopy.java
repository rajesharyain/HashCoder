package com.hashcoder.corejava.ShallowAndDeepCopy;

public class DeepCopy {


	private int id;
	String name;
	private double salary;
	private Department dept;
	
	
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public DeepCopy(int id, String name, double salary, Department dept) {

		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		
	}

	/*public Object deepCopy() throws CloneNotSupportedException
	{
		Employee employee = new Employee(id, name, salary, dept);
		return employee;
	}
	
	public Object shallowCopy() throws CloneNotSupportedException
	{
		return (Employee) super.clone();
	}*/
	
	public Object clone() throws CloneNotSupportedException
	{
		
		DeepCopy employee = new DeepCopy(this.getId(), this.getName(), this.getSalary(), new Department(dept.getDepartMentID(),dept.getDepartMent()));
		return employee;
	}
}
