package com.tna.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String args[]) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"Apple");
		hm.put(2,"Orange");
		hm.put(3,"Durine");
		hm.put(4,"Grape");
		
		hm.merge(5,"Palm",(a,b)->a+"->"+b);
		
		System.out.println(hm.get(4));
		
		System.out.println("Entry Set: " + hm.entrySet());
		System.out.println("Key Set: " +hm.keySet());
		
		
		
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
	}
}
