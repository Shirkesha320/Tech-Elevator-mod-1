package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NonStartTest {

	
	@Test
	public void testNonStart_shouldReturnCorrect() {
		
		//arrange
		NonStart nonStart = new NonStart();
		String expected = "ellohere";
		
		//act 
		String result = nonStart.getPartialString("Hello", "There");
		
		//assert
		assertEquals(expected,result);
		
	}
	
	@Test
	public void testNonStart_shouldReturn() {
		
		//arrange
		NonStart nonStart = new NonStart();
		String expected = "avaode";
		
		//act 
		String result = nonStart.getPartialString("Java", "Code");
		
		//assert
		assertEquals(expected,result);
		
	}
	
	@Test
	public void testNonStart_shouldReturn1() {
		
		//arrange
		NonStart nonStart = new NonStart();
		String expected = "ot";
		
		//act 
		String result = nonStart.getPartialString("hot", "");
		
		//assert
		assertEquals(expected,result);
	}	
	@Test
	public void testNonStart_shouldReturn2() {
		
		//arrange
		NonStart nonStart = new NonStart();
		String expected = "ot";
		
		//act 
		String result = nonStart.getPartialString("", "hot");
		
		//assert
		assertEquals(expected,result);
	}	
}
