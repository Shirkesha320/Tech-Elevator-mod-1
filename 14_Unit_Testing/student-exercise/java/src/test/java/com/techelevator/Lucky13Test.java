package com.techelevator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Lucky13Test {
	
	@Test
	public void testLucky13_shouldReturnTrue() {
		
	//arrange
	Lucky13 lucky13 = new Lucky13();
	int[] nums = {0,2,4}; 
	
	//act
	
	boolean result = lucky13.getLucky(nums);
			
	//assert
	assertTrue(result);		
	}
	@Test
	public void testLucky13_shouldReturnFalse() {
		
	//arrange
	Lucky13 lucky13 = new Lucky13();
	int[] nums = {1, 2, 3}; 
	
	//act
	
	boolean result = lucky13.getLucky(nums);
			
	//assert
	assertFalse(result);		
	}
	@Test
	public void testLucky13_haveOneAndThree_shouldReturnFalse() {
		
	//arrange
	Lucky13 lucky13 = new Lucky13();
	int[] nums = {1,2,4}; 
	
	//act
	
	boolean result = lucky13.getLucky(nums);
			
	//assert
	assertFalse(result);		
	}
}
