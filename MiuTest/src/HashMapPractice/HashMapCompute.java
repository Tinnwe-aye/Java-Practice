package HashMapPractice;

import java.util.HashMap;
import java.util.function.BiFunction;

public class HashMapCompute {
	public static void main(String args[]) {
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    capitalCities.compute("England", (k, v) -> v + "(" + k + ")");
	    System.out.println(capitalCities);
	    capitalCities.computeIfAbsent("Canada", (k) -> "Toronto (" + k + ")");
	    System.out.println(capitalCities);
	    capitalCities.computeIfPresent("England", (k, v) -> v + "(" + k + ")");
	    System.out.println(capitalCities);
		
		//compute with HashMap<String,Integer>
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		map.put("Mango",1);
		map.put("Apple",2);
		BiFunction<String,Integer,Integer> bifun=(key,value)->(value == null) ?  1:value+1;
		map.compute("Apple",bifun);
		map.computeIfPresent("Mango",bifun);
		System.out.println(map);
		
		//compute with HashMap<Integer,String>
		HashMap<Integer,String> mapStr=new HashMap<Integer,String>();
		mapStr.put(1,"Mango");
		mapStr.put(2,"Apple");
		mapStr.put(3,"Lime");
		mapStr.computeIfAbsent(4,(k)->"Orange");
		System.out.println(mapStr);	
		
		//compute with HashMap<Integer,String>
		HashMap<Integer,String> mapStr1=new HashMap<Integer,String>();
		mapStr1.put(1,"Mango");
		mapStr1.put(2,"Apple");
		mapStr1.put(3,"Lime");
		mapStr1.put(4,"Orange");
		BiFunction<Integer,String,String> biStr1=(key,value)->(value == "Orange") ? "Fruit" : value;
		mapStr1.computeIfPresent(4,biStr1);
		System.out.println(mapStr1);	
		
		
	}
}
