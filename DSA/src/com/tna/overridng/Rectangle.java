package com.tna.overridng;

public class Rectangle extends Shape{
	public double width;
	public double height;
	
	public Rectangle(double w,double h) {
		this.width = w;
		this.height = h;
	}
	
	@Override
	public double calculateArea() {
		return width * height;
	}
}
