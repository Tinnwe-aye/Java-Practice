package com.tna.hashmap;

import java.util.LinkedList;

public class testClass {
	public static void main(String args[]) {
		test("Hello");
	}
	
	public static void test(String a) {
		System.out.println((int)a.charAt(1));
		System.out.println(a.charAt(1));
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Apple");
		
		list.get(0);
		
		
	}
}
