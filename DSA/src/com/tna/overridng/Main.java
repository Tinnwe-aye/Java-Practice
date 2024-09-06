package com.tna.overridng;

public class Main {
	public static void main(String args[]) {
		Circle c = new Circle(4);
		System.out.println(c.calculateArea());
		
		Rectangle r = new Rectangle(2.0,3.0);
		System.out.println(r.calculateArea());
		
		Triangle t = new Triangle(2,3);
		System.out.println(t.calculateArea());
	}
}
