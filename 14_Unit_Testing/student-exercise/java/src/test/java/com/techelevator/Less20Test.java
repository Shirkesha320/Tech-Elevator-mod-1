package com.techelevator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Less20Test {

	
	@Test
	public void testLess20_shouldReturnFalse() {
		
		//arrange
		Less20 less20 = new Less20();
		
		//act
		boolean result = less20.isLessThanMultipleOf20(25,false);
		
		//assert
		assertFalse(result);
		}
	
	@Test
	public void testLess20_shouldReturnTrue() {
		
		//arrange
		Less20 less20 = new Less20();
		
		//act
		boolean result = less20.isLessThanMultipleOf20(19, true);
		
		//assert
		assertTrue(result);
		}
}
