package com.tna.linkedlist;
import java.util.LinkedList;

public class Testing {
	public static void main(String args[]) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Toyota");
		cars.add(1,"Mazite");
		cars.add(2,"BMW");
		System.out.println(cars);
		
		cars.set(1,"Mazda");
		System.out.println(cars);
		
		cars.removeLast();//removeFirst , we can also use , removeFirst and removeLast
		System.out.println(cars);
		
		for(String car: cars) {
			System.out.println(car);
		}	
	}
}
