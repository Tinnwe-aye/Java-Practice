package MiuArabic;

import java.util.ArrayList;
import java.util.Arrays;

public class sumFactor {
	
	static int sumFactor(int[] a) {
		int total = 0;
		int occurance = 0;
		
		for(int i=0;i<a.length;i++) {
			total += a[i];
		}
		
		for(int j=0; j<a.length;j++) {
			if(a[j] == total) {
				occurance++;
			}
		}
		
		return occurance;
	}
	
	public static void main(String args[]) {
		
		int[] a = {3,0,2,-5,0};
		System.out.println(sumFactor(a));
		
		int[] b = {9,-3,-3,-1,-1};
		System.out.println(sumFactor(b));
		
		int[] c = {1};
		System.out.println(sumFactor(c));
		
		int[] d = {0,0,0};
		System.out.println(sumFactor(d));
		
	}
}
