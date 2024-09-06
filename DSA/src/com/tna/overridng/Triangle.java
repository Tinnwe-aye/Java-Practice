package com.tna.overridng;

public class Triangle extends Shape{
	public double base;
	public double height;
	
	Triangle(double b, double h){
		this.base = b;
		this.height = h;
	}
	
	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}	
}
