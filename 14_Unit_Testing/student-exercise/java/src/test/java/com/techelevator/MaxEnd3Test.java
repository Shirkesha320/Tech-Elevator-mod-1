package com.techelevator;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MaxEnd3Test {
	
	@Test
	public void testMakeArray_fisrtIsLargest_shouldReturnFirst() {
		//arrange
		MaxEnd3 maxEnd3 = new MaxEnd3();
		int[] expected = {11, 11, 11};
		
		//act
		int[] nums = {11, 5, 9};
		int[] result = maxEnd3.makeArray(nums);
		
		//assert
		assertArrayEquals(expected, result);
		
	}
	
	@Test
	public void testMakeArray_lastIsLargest_shouldReturnLast() {
		//arrange
		MaxEnd3 maxEnd3 = new MaxEnd3();
		int[] expected = {13, 13, 13};
		
		//act
		int[] nums = {11, 5, 13};
		int[] result = maxEnd3.makeArray(nums);
		
		//assert
		assertArrayEquals(expected, result);
		
	}
	
	

}
