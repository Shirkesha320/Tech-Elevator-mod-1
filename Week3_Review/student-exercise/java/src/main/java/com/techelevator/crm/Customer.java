package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techelevator.Billable;
import com.techelevator.Person;

public class Customer extends Person implements Billable {
	//instance
	private String phoneNumber;
	private List<String> pets = new ArrayList<>();
	
	
	//constructors
	public Customer(String firstName, String lastName, String phoneNumber) {
		super(firstName, lastName);
		this.phoneNumber = phoneNumber;
		
	}
	public Customer(String firstName, String lastName) {
		this(firstName, lastName,"");
		
	}	
	
	public String getPhoneNumber() {
		return phoneNumber;
		
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
    }
	
	public void getListPets(List <String>pets) {
		this.pets= pets;
	}
	
	public List<String> getPets() {
		return pets;
	}
	
	@Override
	public double getBalanceDue(Map<String, Double> servicesRendered) {
		double total = 0;
		for (Map.Entry<String, Double> service : servicesRendered.entrySet()) {
			total += service.getValue();
		}
		
		return total;
	}
}