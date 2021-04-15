package com.techelevator;

import java.util.Scanner;
//Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313
//987654321
//460 in binary is 111001100
//8218 in binary is 10000000011010
//1 in binary is 1
//31313 in binary is 111101001010001
//987654321 in binary is 11101011011110011010001011000
  
public class DecimalToBinary {

	public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter decimal (seperated by spaces)"); //number entered
	String[] decimalArray =   userInput.nextLine().split(" "); //sort number
	int[]decimalArrayDb = new int[decimalArray.length];
	
	for (int i = 0; i < decimalArrayDb.length; i ++) {
		decimalArrayDb[i] = Integer.parseInt(decimalArray[i]); 
	}
	for (int i = 0; i < decimalArrayDb.length; i ++) {
		System.out.println(decimalArrayDb[i] + " the binary will be " + Integer.toBinaryString(decimalArrayDb[i]));
	}
	
	//System.out.println("Enter decimals (seperated with spaces)");
	
	//String decValueEntered = input.nextLine();
	//String[] decValuesSep = decValueEntered.split(" ");
	
	//for (int i =0;  i < decValuesSep.length; i++); { ///start loop
	//int inputNumber = Integer.parseInt(decValuesSep[i]);
		
		
		
		
		
		
		
		
		
				//int bNum[] = new int [40];
		//int index = 0;
		
		//int inputNumber = 0;
		//while (inputNumber> 0) {
		//	bNum[index ++] = inputNumber % 2;
		//	inputNumber = inputNumber /2;
		//}
			
		//for (int i = index - 1; i >= ) {
		//	System.out.print(bNum[i]);
		}
		
	
	}
		

//}		
