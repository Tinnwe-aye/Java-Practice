package SampleTest;

import java.util.ArrayList;
import java.util.Arrays;

public class findValue {
	
	static int[] findVal(int[] a,int[] b) {
		if(a == null || b==null) return null;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i] == b[j]) {
					al.add(a[i]);
				}
			}
		}
		
		int[] result =new int[al.size()];
		
		for(int k=0;k<al.size();k++) {
			result[k] = al.get(k);
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(findVal(new int[]{1, 8, 3, 2},new int[] {4, 2, 6, 1})));
		System.out.println(Arrays.toString(findVal(new int[]{1, 8, 3, 2, 6},new int[] {2, 6, 1})));
		System.out.println(Arrays.toString(findVal(new int[]{1, 3, 7, 9},new int[] {7, 1, 9, 3})));
		System.out.println(Arrays.toString(findVal(new int[]{1,2},new int[] {3,4})));
		System.out.println(Arrays.toString(findVal(new int[]{},new int[] {1, 2, 3})));
		System.out.println(Arrays.toString(findVal(new int[]{1, 2},new int[] {})));
		System.out.println(findVal(new int[]{1, 2},null));
		System.out.println(findVal(null,new int[]{}));
		System.out.println(findVal(null,null));
	}

}
