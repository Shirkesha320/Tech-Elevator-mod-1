package com.techelevator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SameFirstLastTest {
	
	
	@Test
	public void testNonStart_helloThereString() {
		//arrange
		SameFirstLast sameFirstLast = new SameFirstLast();
		
		//act
		int[] nums = {1, 2, 3};
		boolean result = sameFirstLast.isItTheSame(nums);
		
		//assert
		assertFalse(result);
		
	}

	@Test
	public void testNonStart_helloThereString_returnTrue() {
		//arrange
		SameFirstLast sameFirstLast = new SameFirstLast();
		
		//act
		int[] nums = {1, 2, 1};
		boolean result = sameFirstLast.isItTheSame(nums);
		
		//assert
		assertTrue(result);
		
	}
	@Test
	public void testNonStart_getNull() {
		//arrange
		SameFirstLast sameFirstLast = new SameFirstLast();
				
		//act
		int[] nums = null;
		boolean result = sameFirstLast.isItTheSame(nums);
				
		//assert
		assertFalse(result);
		
	}
}
