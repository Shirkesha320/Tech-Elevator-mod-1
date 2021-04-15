package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		
		wordSearch ("alices_adventures_in_wonderland.txt");
	}
		
	public static void wordSearch (String path) {
		
		Scanner userInput = new Scanner (System.in); 
		System.out.println("Please enter file you are looking for: ");
		
		String filePath= userInput.nextLine();
	
		System.out.print("What is the word you are looking for?");
		 String searchWord = userInput.nextLine();
		 
		
		
		System.out.print("Do you the search to be case sensitive? (Yes or No)");
		String yesOrNo = userInput.nextLine();
	
	
		  if (yesOrNo.contentEquals ("Yes")) {
			  
			  searchWord.toLowerCase();
		  } 
			  
			  
		 File alice = new File (filePath = "alices_adventures_in_wonderland.txt");  
		  
		try (Scanner scanner = new Scanner (alice)) {
			int lineNum = 1;
			while (scanner.hasNextLine()) {
				String lineFromFile = scanner.nextLine();
				lineNum++; 
				if (lineFromFile.contains(searchWord))
					System.out.println(lineNum + ")" +  " " + " " + lineFromFile);
			}
		
		}catch (FileNotFoundException e) {
			System.out.print("File not Found.");
			
				}
				
			
		}
	
	}
	


