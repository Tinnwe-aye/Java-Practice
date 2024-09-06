package maharashiTEst;

import java.util.Arrays;

public class decodeArray {
	
	static String decodeArrays(int[] a) {
		
		String res="";
		String sign = "";
		if(a[0] < 0) sign = "-";
		for(int i=0;i<a.length-1;i++) {
			int total = a[i]-a[i+1];
			int absuleValue = Math.abs(total);			
			res += Integer.toString(absuleValue);
		}
		
		return sign+res;
	}	

	public static void main(String args[]) {
		
		int[] a= {0,-3,0,-4,0};
		System.out.println(decodeArrays(a));
		int[] b= {-1,5,8,17,15};
		System.out.println(decodeArrays(b));
		int[] c= {1,5,8,17,15};
		System.out.println(decodeArrays(c));
		int[] d= {111,115,118,127,125};
		System.out.println(decodeArrays(d));
	}
}
