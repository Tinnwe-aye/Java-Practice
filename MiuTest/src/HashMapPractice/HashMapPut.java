package HashMapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPut {
	public static void main(String args[]) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		//add
		System.out.println("***Put***");
		hm.put(4,"a");
		hm.put(3,"b");
		hm.put(2,"c");
		hm.put(1,"d");
		
		hm.putIfAbsent(5,"e");
		
		HashMap<Integer,String> newhm=new HashMap<Integer,String>();
		newhm.putAll(hm);
		System.out.println(newhm);
		
		
		System.out.println("***EntrySet,KeySet***");
		for(Map.Entry m:newhm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		// Getting the keySet
        Set<Integer> keys = newhm.keySet();
        System.out.println(keys);
		
	}
}
