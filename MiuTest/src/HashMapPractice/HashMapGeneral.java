package HashMapPractice;

import java.util.*;

public class HashMapGeneral {
	public static void main(String args[]) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Mango");
		map.put(2,"Apple");
		
		System.out.println(map.containsValue("Mango"));
		System.out.println(map.containsKey(2));//key
		System.out.println(map.equals(1));//key ..need to research
		System.out.println(map.get(1));
		System.out.println(map.getOrDefault(3,"Lime"));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.clone());
		
		map.merge(2,"Papaya",(a,b)-> a+ " -> " + b);
		map.merge(3,"Orange",(a,b)-> a+ " -> " + b);
		System.out.println(map);
		
		HashMap<String,Integer> hm=new HashMap<>();
//		String key = "Aman";
//		int hashCode = key.hashCode(); // Calculate the hash code of the key
//		System.out.println(hashCode);
//		int arrayLength = 16; // Example array length (must be a power of 2)
//		int index = hashCode & (arrayLength - 1); // Calculate the index
//		System.out.println(index);
		
		 String str1 = "Aman";
	     int hashCode1 = str1.hashCode();
	     System.out.println("Hash code of \"" + str1 + "\" is: " + hashCode1);
	     
	     String str2 = "Sunny";
	     int hashCode2 = str2.hashCode();
	     System.out.println("Hash code of \"" + str2 + "\" is: " + hashCode2);
		
	}

}
