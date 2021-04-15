package com.techelevator;

public class Department {
	
	
	//Instance variables
	private int departmentId;
	private String name;
	
	
	//Constructors
	
	public Department(int departmentId, String name) {
		this.departmentId = departmentId;
		this.name = name;
	}
  
	//getter
	
	public int getDepartmentId() {
		return departmentId;
	}
	public String getName() {
		return name;
		
	}
	//setters
	
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public void setName(String name) {
		this.name = name;
	}
	}

