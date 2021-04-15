package com.techelevator;

public class SquareWall extends RectangleWall {

//	public SquareWall(String name, String color, int length, int height) {
//		super(name, color, length, height);
//		// TODO Auto-generated constructor stub
	//}
	
	// instance var

	
	public SquareWall(String name, String color, int sideLength) {
		super(name, color, sideLength, sideLength);
		
	}
	
	
	
	
	public String toString() {
		return getName() + " (" + getHeight() + "x" + getLength() +") square";
	
	}
}
