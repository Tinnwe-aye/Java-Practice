package arraylistpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
	
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		list.add("Lime");
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
