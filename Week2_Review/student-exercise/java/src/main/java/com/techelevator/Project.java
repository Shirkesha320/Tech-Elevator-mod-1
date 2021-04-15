package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Project {
	
	//Instance variables
	private String name;
	private String description;
	private String startDate;
	private String dueDate;
	private List<Employee> teamMembers = new ArrayList<Employee>();
	
	//constructor
	
	public Project (String name, String description,
			String startDate, String dueDate) {
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.dueDate = dueDate;
	}
	//getters
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public ArrayList <Employee> getTeamMembers(){
		return (ArrayList<Employee>) teamMembers;
	}
	public void setName(String name) { 
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public void setTeamMembers(ArrayList <Employee> teamMembers) {
		this.teamMembers = teamMembers;
	}
}
