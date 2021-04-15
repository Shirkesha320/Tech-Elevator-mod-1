package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrontTimesTest {
	
	
	@Test
	public void testFrontTimes_chocolateString() {
		
		//arrange
		FrontTimes frontTimes = new FrontTimes();
		String expected = "ChoChoCho";
		
		//act
		String result = frontTimes.generateString("Chocolate", 3);
		
		//assert
		assertEquals(expected,result);
		
	}
	
	@Test
	public void testFrontTimes_null() {
		
		//arrange
		FrontTimes frontTimes = new FrontTimes();
		String expected = "";
		
		//act
		String result = frontTimes.generateString(null, 3);
		
		//assert
		assertEquals(expected,result);
	}
	
	@Test
	public void testFrontTimes_testLessThan3() {
		
		//arrange
		FrontTimes frontTimes = new FrontTimes();
		String expected = "ohoh";
		
		//act
		String result = frontTimes.generateString("oh", 2);
		
		//assert
		assertEquals(expected,result);
	}
}
