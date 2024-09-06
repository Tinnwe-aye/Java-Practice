package maharashiTEst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class equivalentArray {
	
	static int equivalentArrays(int[] a1, int[] a2) {
		int res1=0;
		int res2 = 0;
		int finalRes=0;
		ArrayList<Integer> tmp1 = new ArrayList<>();
		ArrayList<Integer> tmp2 = new ArrayList<>();
		
		for (int i = 0; i < a1.length; i++) {
		    for (int j = 0; j < a2.length; j++) {				
		        if (a1[i] == a2[j]) {
		        	tmp1.add(1);
		        	break;
		        }
		    }
		}
		
		res1 = (tmp1.size() == a1.length) ? 1 : 0 ;
		
		for (int i = 0; i < a2.length; i++) {
		    for (int j = 0; j < a1.length; j++) {
		        if (a2[i] == a1[j]) {
		        	tmp2.add(1);
		        	break;
		        }
		    }
		}
		res2 = (tmp2.size() == a2.length) ? 1 : 0 ;

		finalRes = (res1==1 && res2==1)? 1: 0 ;
		
		return finalRes;
	}
	
	public static void main(String args[]) {
		int[] a1= {};
		int[] a2= {};
		System.out.println(equivalentArrays(a1,a2));
	}
	
}
