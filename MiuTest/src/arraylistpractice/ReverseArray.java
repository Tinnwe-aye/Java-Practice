package arraylistpractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	
	public static void main(String args[]) {
		String[] a= {"Apple", "Lime",  "Mango", "Orange"};
		System.out.println(Arrays.toString(a));
		
		List<String> list=Arrays.asList(a);
		Collections.reverse(list);
		
		System.out.println(list);
	}
}
