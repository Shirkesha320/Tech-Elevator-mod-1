package com.techelevator;

public abstract class Wall {
	
	// instance var
	
	private String name;
	private String color;
	
	/// constructor
		public Wall (String name, String color) {
			this.name = name;
			this.color = color; 
	}

		public abstract int getArea();
    	
		public String getColor() {
			return color;
		}
			public String getName() {
				return name;
			}
}
	
