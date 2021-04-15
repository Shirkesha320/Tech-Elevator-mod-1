package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	private static Scanner input;

	public static void main(String[] args) { 
		

	
		int fNum = 0; //inital number
		int sNum = 0;// number kept
		int tNum = 0;//number kept to move with
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number: ");
		
		int orginNum = input.nextInt();/// 25
		input.nextLine();
		
		System.out.print(0 + " ");
		 for (int nextNum = 1; nextNum <= orginNum;) {
			 System.out.print(nextNum + " ");
			 tNum = fNum;
			 fNum = nextNum;
			 nextNum = nextNum + tNum;
		 }
		
	}
		
		
}
