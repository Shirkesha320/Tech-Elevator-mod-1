package com.techelevator.crm;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.techelevator.hr.Employee;

public class EmployeeTest {
	
	
	@Test
	public void testEmployee_getBalanceDue() {
		//arrange
		Employee employee = new Employee("Shirkesha", "Barnes");
		
		Map<String, Double> balanceMap = new HashMap<>();
		
		balanceMap.put("Grooming", 50.0);
		balanceMap.put("Walking", 55.70);
		balanceMap.put("Sitting", 15.0);
		
		//act
		Double result = employee.getBalanceDue(balanceMap);
		
		//assert
		Double expected = 60.35;
		assertEquals(expected,result);
	}

	       
}

			
			
			
			
			
			
			
			