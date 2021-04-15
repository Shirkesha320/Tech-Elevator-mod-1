package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {
public static void main(String[] args) {

	File fizzBuzz = new File ("FizzBuzz.txt");


try(PrintWriter writer = new PrintWriter(fizzBuzz.getAbsolutePath())) {
	
	for (int i =1; i < 301; i++) {
		if (i % 5 == 0 && i % 3 == 0) {
			writer.println("FizzBuzz");
			
		} else if (i % 3 == 0) {
			writer.println("Fizz");
			
		} else if (i % 5 == 0) {
			writer.println("Buzz");
			
		} else {
			writer.println(i);
		}
		
	}
	     writer.flush();
	   writer.close();
	
}        catch (FileNotFoundException e) {
	        System.out.println("It didnt work");
        }

     }

}
