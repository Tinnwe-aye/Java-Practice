package HashMapPractice;

import java.util.HashMap;

public class HashMapReplace {
	public static void main(String args[]) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Apple");
		map.put(2,"Orange");
		map.put(3,"Lime");
		
		map.replace(3,"Mango");
		map.replace(2,"Orange","Lime");
		map.replaceAll((k,v)->"Papaya");
		
		System.out.println(map);
	}
}
