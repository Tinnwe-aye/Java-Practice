package HashMapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntrySetKeySet {
	public static void main(String args[]) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Mango");
		map.put(2,"Apple");
		map.put(3,"Orange");
		
		//EntrySet
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//KeySet
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
	}
}
