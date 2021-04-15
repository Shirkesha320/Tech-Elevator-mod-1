package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	//Tc = (Tf - 32) / 1.8
	//		Tf = Tc * 1.8 + 32
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature");
		
		int temp = input.nextInt();
		input.nextLine();
		
		System.out.println("Type (C) or (F)?");
		 String scale = input.nextLine();
		 
		 if (scale.contentEquals("C")) {
			 int tempInF = (int) ((temp * 1.8) + 32);
			 System.out.println(temp + "C is" + tempInF + "F");
			 
		 }
		 else if (scale.equals("F")) {
			 int tempInC = (int) ((temp -32) / 1.8);
			 System.out.println(temp + "F is" + tempInC + " C.");
				
		
		
	
	}
	 
		
		
	}
	}
	
	   
	

	 
		
		

	


