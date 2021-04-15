package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringBitsTest {
	
@Test
	
	public  void testStringBits_withCorrectString_shouldReturnCorrect() {
		//arrange
		StringBits StringBits = new StringBits();
		String expected = "Hlo";
		
		//act
		
		String result = StringBits.getBits("Hello");
		
		
		//assert
		
		assertEquals(expected, result);
	}
	@Test
	public  void testStringBits_withEmptyString_shouldReturnCorrect() {
		//arrange
		StringBits StringBits = new StringBits();
		
		String expected = "";
	
		
		//act
		String result = StringBits.getBits(null);
		
		//assert
		assertEquals(expected, result);
	}
}


