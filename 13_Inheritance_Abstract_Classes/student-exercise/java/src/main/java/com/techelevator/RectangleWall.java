package com.techelevator;

public class RectangleWall extends Wall {
	
	// instance var
	protected int length;
	private int height;
	
	
	//constructors
	
	public RectangleWall( String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
	}

	 public int getHeight() {
	    	return height;
	    	
}
	public int getLength() {
		return length;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return length * height;
	}
	
	public String toString() {
		return getName() + " (" + length + "x" + height +") rectangle";
	
	}

	
	
	
	 }





