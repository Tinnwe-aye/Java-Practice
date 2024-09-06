package MiuArabic;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicate {
	
	static ArrayList removeDuplicateArray(int[] a) {
		ArrayList<Integer> duplicateArr = new ArrayList<>();
		ArrayList<Integer> noDuplicateArr = new ArrayList<>();

		
		for(int i=0; i<a.length;i++) {
			duplicateArr.add(a[i]);
		}
		
		for(int j=0;j<duplicateArr.size();j++) {
			 int first = (int) duplicateArr.get(j);
			 if(!noDuplicateArr.contains(first)) {
				 noDuplicateArr.add(first);
			 }
			
		}
		
		
		return noDuplicateArr; 
	}
	
	public static void main(String args[]) {
		int[] a= {1,2,3,4,5};
		System.out.println(removeDuplicateArray(a));
		
		int[] b= {1,2,1,3,4,2,5};
		System.out.println(removeDuplicateArray(b));
		
		int[] c= {12,32,1,3,6,2,12,3,1,2};
		System.out.println(removeDuplicateArray(c));
	}

}
