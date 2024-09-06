package MiuArabic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class valueTwoArray {
	
	static ArrayList commonValuearray(int[] a, int[] b) {
		ArrayList<Integer> resultArray = new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i] == b[j]) {
					resultArray.add(a[i]);
					break;
				}
			}
		}

		return resultArray;
	}
	
	
	public static void main(String args[]) {
		
		int[] a = {1,8,3,2};
		int[] b = {4,2,6,1};
		System.out.println(commonValuearray(a,b));
		
		int[] c = {1,8,3,2,6};
		int[] d = {2,6,1};
		System.out.println(commonValuearray(c,d));
		
		int[] e = {1,3,7,9};
		int[] f = {7,1,9,3};
		System.out.println(commonValuearray(e,f));
		
		int[] g = {1,2};
		int[] h = {3,4};
		System.out.println(commonValuearray(g,h));
		
		int[] i = {};
		int[] j = {1,2,3};
		System.out.println(commonValuearray(i,j));
		
		int[] k = {1,2};
		int[] l = {};
		System.out.println(commonValuearray(k,l));
		
		int[] m = {1,2};
		int[] n = null;
		System.out.println(commonValuearray(k,l));
		
	}

}
