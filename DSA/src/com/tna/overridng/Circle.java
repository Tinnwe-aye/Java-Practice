package com.tna.overridng;

public class Circle extends Shape{
	
	public double radius;
	
	Circle(double r){
		this.radius = r;
	}
	
	@Override
	public double calculateArea(){		
		return Math.PI * radius * radius;
	}

}
