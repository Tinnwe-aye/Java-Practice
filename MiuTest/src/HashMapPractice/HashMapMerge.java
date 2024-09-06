package HashMapPractice;

import java.util.HashMap;

public class HashMapMerge {
	public static void main(String args[]) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Mango");
		map.put(2,"Apple");
		
		map.merge(2,"Papaya",(a,b)-> a+ " -> " + b);
		map.merge(3,"Orange",(a,b)-> a+ " -> " + b);
		
		System.out.println(map);
	}
}
