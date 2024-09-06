package arrayPractice;

import java.util.ArrayList;

public class retainAllExample {
	
	public void retainAllTest() {
		ArrayList<Integer> num=new ArrayList<>();
		num.add(1);
		num.add(3);
		num.add(null);
		System.out.println(num);
		
		ArrayList<Integer> number=new ArrayList<>();
		number.add(2);
		number.add(3);
		number.add(null);
		System.out.println(number);
		
		// retainAll is like intersect.
		System.out.println(number.retainAll(num));
		System.out.println(number);
	}
	
	

}
