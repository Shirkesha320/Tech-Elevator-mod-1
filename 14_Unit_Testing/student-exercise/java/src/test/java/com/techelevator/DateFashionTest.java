package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DateFashionTest {

	@Test
	public void testDateFashion_highFashion_shouldReturn2() {
	
		
		//arrange
       DateFashion  dateFashion = new DateFashion(); 
    	         
        int expected = 2;
		
		
		//act
		 int  result = dateFashion.getATable(8, 3);
		
		
		//arrange
        assertEquals(expected, result);
        
        
       }
	@Test
    public void testDateFashion_highFashion_shouldReturn1() {
	
		
		//arrange
       DateFashion  dateFashion = new DateFashion(); 
    	         
        int expected = 1;
		
		
		//act
		 int  result = dateFashion.getATable(4, 6);
		 
		 
		 //assert
		 assertEquals(expected, result);
		
	}
	
	@Test
 public void testDateFashion_highFashion_shouldReturn0() {
	
		
		//arrange
       DateFashion  dateFashion = new DateFashion(); 
    	         
        int expected = 0;
		
		
		//act
		 int  result = dateFashion.getATable(1, 1);
		 
		 
		 //assert
		 assertEquals(expected, result);
		
	}
	
}
