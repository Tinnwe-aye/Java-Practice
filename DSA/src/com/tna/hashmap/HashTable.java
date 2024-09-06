package com.tna.hashmap;

public class HashTable {
	
	static final String[] myHashSet = {null, "Jones", null, "Lisa", null, "Bob", null, "Siri", "Pete", null};
	
	// Hashing 
	public static int hashFunction(String value) {	
		int sum = 0;
		for(int i = 0; i < value.length(); i++) {
			sum += value.charAt(i);
		}	
		return sum % 10;
	}
	
	//check contain 
	public static boolean contains(String value) {
		int idx = hashFunction(value);
		return myHashSet[idx] != null && myHashSet[idx].equals(value);
	}
	
	public static void main(String args[]) {
		String value = "Bob";
        System.out.println("'" + value + "' has hash code: " + hashFunction(value));
	}
}
