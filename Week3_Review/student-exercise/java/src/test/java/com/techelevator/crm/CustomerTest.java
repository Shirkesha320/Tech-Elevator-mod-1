package com.techelevator.crm;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CustomerTest {
	
	@Test
	public void testCustomer_getBalanceDue() {
		//arrange
		Customer customer = new Customer("Shirkesha", "Barnes");
		
		Map<String, Double> balanceMap = new HashMap<>();
		
		balanceMap.put("Grooming", 50.0);
		balanceMap.put("Walking", 10.0);
		balanceMap.put("Sitting", 15.0);
		
		//act
		Double result = customer.getBalanceDue(balanceMap);
		
		//assert
		Double expected = 75.0;
		assertEquals(expected,result);
	}

}
