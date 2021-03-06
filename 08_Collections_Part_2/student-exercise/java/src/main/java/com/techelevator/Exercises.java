package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 * (HINT: we discussed how to check for String equality without considering case when
	 * learning about the equals method. If you don't remember what the method for that is,
	 * use the String's dot operator to list its available methods)
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		
		Map<String, String> animalGroupNameNew = new HashMap<> ();
		
		animalGroupNameNew.put("rhino", "Crash");
		animalGroupNameNew.put("giraffe", "Tower");
		animalGroupNameNew.put("elephant", "Herd");
		animalGroupNameNew.put("lion", "Pride");
		animalGroupNameNew.put("crow", "Murder");
		animalGroupNameNew.put("pigeon", "Kit");
		animalGroupNameNew.put("flamingo", "Pat");
		animalGroupNameNew.put("deer", "Herd");
		animalGroupNameNew.put("dog", "Pack");
		animalGroupNameNew.put("crocodile", "Float");
		
		
	// if (animalGroupNameNew.containsKey(animalName)) {
		// return animalGroupNameNew.get(animalNameGroupNew.toLowerCase();
	//	 } else { return "unknown";
		if (animalName == null || animalName.isEmpty()) {
			return "unknown";
		
		} else {
			String animalNameLowerCase = animalName.toLowerCase();
			if (animalGroupNameNew.containsKey(animalNameLowerCase)) {
				return animalGroupNameNew.get(animalNameLowerCase);
			} else {
				return "unknown";
			}
		}
		
		

	}
	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {
		Map<String, Double> isItOnSale = new HashMap<String, Double>(); 
		 
		
		 		 
		isItOnSale.put("kitchen4001", 0.20);
		isItOnSale.put("GARAGE1070", 0.15);
		isItOnSale.put("LIVINGROOM",  0.10);
		isItOnSale.put("KITCHEN6073", 0.40);
		isItOnSale.put("BATH0073", 0.15);
		 
		 if (itemNumber == null  || itemNumber == "") {
			 return 0.00;
		  
		 } 
			 itemNumber = itemNumber.toLowerCase();
		 Double discount = isItOnSale.get(itemNumber);
		
		if (discount == null) {
		
		}
	
		 return discount;
}


	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * *************************************************************************************************************
	 * ***IMPORTANT NOTE: monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * *************************************************************************************************************
	 * 
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		int peterMoney = peterPaul.get("Peter");
		int paulMoney = peterPaul.get("Paul");
		
		if (peterMoney > 0 && paulMoney <1000) {
			int moneyToPaul = peterMoney /2;
			peterPaul.put("Paul", paulMoney + moneyToPaul);
			peterPaul.put("Peter", peterMoney - moneyToPaul);
		}
		return peterPaul;
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		
		Integer peterMoney = peterPaul.get("Peter");
		Integer paulMoney = peterPaul.get("Paul");
		
		if (peterMoney > 4999 && paulMoney > 9999) {
			Integer peterGives = peterMoney / 4;
			Integer paulGives  = paulMoney / 4;
			
			peterPaul.put("PeterPaulPartnership", peterGives + paulGives);
			peterPaul.put("Peter", peterMoney - peterGives);
		    peterPaul.put("Paul", paulMoney - paulGives );
		}
		return peterPaul;
	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		
		Map<String, String> fcharKey = new HashMap<>();
		
		for (String element : words) {
			fcharKey.put(element.substring(0 , 1), String.valueOf(element.charAt(element.length() - 1)));
			
			
		}
		return fcharKey;
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		
		Map<String, Integer> keyOfString = new HashMap<>();
		
		for (String elements : words) {
			
			if (!keyOfString.containsKey(elements)) {
				keyOfString.put(elements, 1);
			}
			else {
				int count = keyOfString.get(elements);
				keyOfString.put(elements, count + 1);
			}
			
		}
		return keyOfString;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> keysEachInt = new HashMap<>();
		
		for (Integer elements : ints) {
			if (!keysEachInt.containsKey(elements)) {
				keysEachInt.put(elements, 1);
			}
			else {
				int count = keysEachInt.get(elements);
				 keysEachInt.put(elements, count + 1);
			}
		}
				
		return keysEachInt;
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		
		Map<String, Boolean> booleanMap = new HashMap<>();
		
		Map <String, Integer> intMap = new HashMap<>();
		
		for (String clear : words) {
			if (booleanMap.containsKey(clear) && booleanMap.get(clear)) {
				continue;
			}
			if (intMap.containsKey(clear)) {
				intMap.put(clear, intMap .get(clear) + 1);
			}
			else {
				intMap.put(clear, 1);
			}
			booleanMap.put(clear, intMap.get(clear) >= 2);
		}
			
		return booleanMap;
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
	   Map<String, Integer> remoteWarehouse) {
		
		
		Map<String, Integer> conMaps = new HashMap<String, Integer>();
	
		for (String name : mainWarehouse.keySet()) {	
		 if (remoteWarehouse.containsKey(name)) {
			 conMaps.put(name, (mainWarehouse.get(name) + remoteWarehouse.get(name)));
		
		 } else {
			 conMaps.put(name, mainWarehouse.get(name));
    	 }
	     }    
		
		for (String name : remoteWarehouse.keySet()) {
			if (!(mainWarehouse.containsKey(name))) {
			conMaps.put(name, remoteWarehouse.get(name));
			}
		}
		return conMaps;
	}		
	
		

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map<String, Integer> last2RevisitedMap = new HashMap<>();
		
		for (String word : words) {
			String key = word.substring(word.length() -2);
			int keyCounter = 0;
			
		for (int i = 0; i < word.length() -2; i++)	{
			String strToCheckAginistKey = word.substring(i, i + 2);
			if (strToCheckAginistKey.equals(key)) {
				keyCounter++;
		}
	} 
		
		last2RevisitedMap.put(word, keyCounter);
		
	}
		return last2RevisitedMap;
}
}