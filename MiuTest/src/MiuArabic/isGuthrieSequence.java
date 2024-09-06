package MiuArabic;

import java.util.ArrayList;
import java.util.Arrays;

public class isGuthrieSequence {
	
	static int isGuthrie(int[] a) {
		int result = 1;
		int num = a[0];
		if (num == 0 ) return 0;
		ArrayList<Integer> guthArray = new ArrayList<Integer>();
		guthArray.add(num);
		
		while(num > 1) {
			if(num % 2 == 0) {
				num /=2;
				guthArray.add(num);
			}else {	
				num = (num * 3) + 1;
				guthArray.add(num);
			}
		}

		int[] guth=new int[guthArray.size()];
		for(int i=0;i<guthArray.size();i++) {
			guth[i] = guthArray.get(i);
		}
		result = (Arrays.equals(guth, a)) ? 1 : 0 ;
		
		return result;
	}
	
	public static void main(String args[]) {
		int[] a= {8,4,2,1};
		System.out.println(isGuthrie(a));
		
		int[] b= {8,17,4,1};
		System.out.println(isGuthrie(b));
		
		int[] c= {8,4,1};
		System.out.println(isGuthrie(c));
		
		int[] d= {8,4,2};
		System.out.println(isGuthrie(d));
	}

}
