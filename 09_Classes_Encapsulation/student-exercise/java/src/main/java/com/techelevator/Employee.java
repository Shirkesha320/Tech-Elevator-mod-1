package com.techelevator;

public class Employee {
	
	int employeeId;
	String firstName;
	String lastName;
	String fullName;
	String department;
	double annualSalary;
	
	///constructor
	public Employee(int employeeId, String firstName, 
		String lastName, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFullName() {
	 fullName = lastName + ", " + firstName; 
	 	return fullName;
	}
	public String getDepartment() {
		return department;
	}
	public double getAnnualSalary() {
		 return annualSalary;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		this.fullName = lastName + ", " + firstName;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void  raiseSalary(double percent) {
		if (percent > 0.00) {
			annualSalary = ((100 + percent) / 100.0) * annualSalary;
		
	}
}
}