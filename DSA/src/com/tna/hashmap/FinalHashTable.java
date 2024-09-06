package com.tna.hashmap;

import java.util.LinkedList;


public class FinalHashTable {
	static LinkedList<String>[] myHashSet = new LinkedList[10]; // hashing is 0-9
	
	// Hashing 
		public static int hashFunction(String value) {	
			int sum = 0;
			for(int i = 0; i < value.length(); i++) {
				sum += value.charAt(i);
			}	
			return sum % 10;
		}
		
		public static boolean contains(String value) {
			int index = hashFunction(value);
			LinkedList<String> bucket = myHashSet[index];
			return bucket.contains(value);
		}
		
		public static void add(String value) {
			int index = hashFunction(value);
			LinkedList<String> bucket = myHashSet[index];
			if(!bucket.contains(value)) {
				bucket.add(value);
			}
		}
		
		public static void remove(String value) {
			int index = hashFunction(value);
			LinkedList<String> bucket = myHashSet[index];
			if(bucket.contains(value)) {
				bucket.remove(value);
			}
		}
		
		public static void main(String args[]) {
			for (int i = 0; i < myHashSet.length; i++) {
	            myHashSet[i] = new LinkedList<>();
	        }
	        
			add("Jones");// hashFunction("Jones") - 1
	        add("Lisa");//3
	        add("Bob");//5
	        add("Siri");//7
	        add("Pete");// 8
	        add("Stuart"); // 3
	        
	        for(LinkedList<String> bucket:myHashSet) {
	        	 System.out.println(bucket);
	        }
	        System.out.println("---------------------------------");
	        
	        remove("Stuart");
	        for(LinkedList<String> bucket:myHashSet) {
	        	 System.out.println(bucket);
	        }
	        System.out.println("---------------------------------");
	        
		}
	
}

/*
 * []
 * [Jones]
 * []
 * [Lisa, Stuart]
 * []
 * [Bob]
 * []
 * [Siri]
 * [Pete]
 * []
 */
