package com.techelevator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CigarPartyTest {
	
	@Test
	public void testHaveParty_unccesfulPartyNotWeekend_returnTrue() {
		
		//arrange
		CigarParty  cigarParty = new CigarParty();
		
		//act
		boolean result = cigarParty.haveParty(40, false);
		
		//assert
		assertTrue(result);
		
		
	}
	
	@Test
	public void testHaveParty_unsuccesfulPartyNotWeekend_returnFalse() {
		
		//arrange
		CigarParty  cigarParty = new CigarParty();
		
		//act
		boolean result = cigarParty.haveParty(70, false);
		
		//assert
		assertFalse(result);
	}
	
	@Test
	public void testHaveParty_succesfulPartyNotWeekend_returnTrue() {
		
		//arrange
		CigarParty  cigarParty = new CigarParty();
		
		//act
		boolean result = cigarParty.haveParty(100, true);
		
		//assert
		assertTrue(result);
		
	}
	
	@Test
      public void testHaveParty_unsuccesfulPartyNotWeekend_returnTrue() {
		
		//arrange
		CigarParty  cigarParty = new CigarParty();
		
		//act
		boolean result = cigarParty.haveParty(30, false);
		
		//assert
		assertFalse(result);
		
	}
	
}
