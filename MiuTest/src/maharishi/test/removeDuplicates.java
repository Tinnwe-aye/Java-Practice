package maharishi.test;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDuplicates {
	public static void main(String args[]) {
		int[] a = {1,2,1,3,4};
		int k = 1;
		
		for(int i = 1;i<a.length;i++) {
			boolean duplicate = false;
			for(int j = i-1 ; j >= 0 ; j--) {
				if( a[i] == a[j] ) {
					duplicate = true;				
				}
			}
			System.out.println(duplicate);
			if(!duplicate) {
				a[k] = a[i];
				k++;
			}
		}
		
		int[] res = new int[k];
		for(int x=0;x<k;x++) {
			res[x] = a[x];
		}
		
		System.out.println(Arrays.toString(res));
	}
}
//remove duplicate and show with new array