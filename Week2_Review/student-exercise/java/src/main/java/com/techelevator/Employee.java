package com.techelevator;

public class Employee {
	
	//Instance variables
	private static final double SALARY = 60000;
	private long employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;// DEFAULT_STARTING_SALARY;
	private Department department;
	private String hireDate;

	// get full name and salary
	public String getFullName() {
		return lastName + ", " + firstName;
	}
	public void raiseSalary(int percent) {
		this.salary = salary * (1 + (double) percent / 100);
	}
	//Constructors
	public Employee() {//look at this one? multiple ways?
	this.salary = SALARY;
	}
	
	public Employee(long employeeId, String firstName, String lastName, String email,
			          Department department, String hireDate) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.department = department;
		this.hireDate = hireDate;
		this.salary = SALARY;
    }
	// getter
	public long getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public double getSalary() {
		return salary;
	}
	public Department getDepartment() {
		return department;
	}
	public String getHireDate() {
		return hireDate;
	}
	
	//setters
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}