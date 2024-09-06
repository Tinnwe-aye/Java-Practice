package HashMapPractice;

import java.util.HashMap;

public class HashMapRemove {
	public static void main(String args[]) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Apple");
		map.put(2,"Orange");
		map.put(3,"Lime");
		
		map.remove(2);
		map.remove(3,"Lime");
		
		System.out.println(map);
	}
}
