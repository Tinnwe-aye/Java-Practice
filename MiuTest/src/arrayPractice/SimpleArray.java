package arrayPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleArray {
	
	public String type;
	public String process;
	
	SimpleArray(String type,String process){
		this.type=type;
		this.process=process;
	}
	
	public String[] CreateArray() {
		String[] str = new String[2];
		
		//add data
		str[0]= "a";
		str[1]= "b";
		
		//get data
		String first = str[0];
		System.out.println("Get Data "+first);
		
		//update data
		str[0] = "c";
		
		//getSize of Array
		System.out.println("Length "+str.length);
		
		//output data
		for(String st:str) {
			System.out.println(st);
		}
		
		return str;
	}
	
	public ArrayList<Integer> CreateArrayList() {
		ArrayList<Integer> al=new ArrayList<>();
		
		//add data
		al.add(1);
		al.add(2);
		al.add(3);
		
		//get data
		al.get(1);
		//update data
		al.set(1,22);
		
		//remove data remove/removeAll/removeRange
		//can not remove in this way , error can cause there is no index 22
		//al.remove(22);
		
		//getSize of ArrayList
		System.out.println("Length "+al.size());
		
		//output data
		for(int num:al) {
			System.out.println(num);
		}
		
		return al;
	}
	
	public List<String> CreateListOfArrayList() {
		List<String> list= new ArrayList<>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		
		//add with index
		list.add(3,"Tomato");
		
		//remove data remove/removeAll/removeRange(from index to index)
		list.remove("Orange");
		
		System.out.println(list.get(1));
		
		//sort 
		Collections.sort(list);
		
		return list;
	}
}
