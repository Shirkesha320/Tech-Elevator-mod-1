package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnimalGroupNameTest {
	@Test
		public void testGetHerd_withFoundKey_shouldReturnCorrectValue() {
		  //arrange
		  AnimalGroupName animalGroupName = new AnimalGroupName();
		 
		  String expected = "Herd";
		 
		  //Act
		  String result = animalGroupName.getHerd("elephant");
		 
		  //Assert
		  assertEquals(expected, result);
	 }
	@Test
	public void testGetHerd_withNotFoundKey_shouldReturnUnknown() {
		
		 //arrange
		  AnimalGroupName animalGroupName = new AnimalGroupName();
		 
		  String expected = "unknown";
		 
		  //Act
		  String result = animalGroupName.getHerd("xxxxx");
		 
		  //Assert
		  assertEquals(expected, result);
	}
	@Test
	public void testGetHerdNull_shouldReturnUnknown() {
		
	//arrange
	  AnimalGroupName animalGroupName = new AnimalGroupName();
	 
	  String expected = "unknown";
	 
	  //Act
	  String result = animalGroupName.getHerd(null);
	 
	  //Assert
	  assertEquals(expected, result);
	  

	}
	
}
