package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	
	
	//The foot to meter conversion formula is:
	//	m = f * 0.3048
	//	The meter to foot conversion formula is:
	//	f = m * 3.2808399
	//	Write a command line program which prompts a user to ent
	//Please enter the length: 58
	//Is the measurement in (m)eter, or (f)eet? f
	//58f is 17m.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Length here");
		int length = Integer.parseInt(input.nextLine());
		
		System.out.println("Measurement in m for meters of f for feet ?");
		String meterFeet = input.nextLine();
		
		if (meterFeet.contentEquals("m")) {
			int makeToFeet = (int)(length *3.2808399);
			System.out.println(length + "m is" + makeToFeet + " f");
		}
		else if (meterFeet.contentEquals("f")) {
			int makeMeter = (int)(length * 0.3048);
			System.out.println(length + " f is " + makeMeter + " m ");
				
		}
	}

}
