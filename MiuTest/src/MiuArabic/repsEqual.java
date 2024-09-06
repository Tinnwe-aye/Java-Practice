package MiuArabic;

import java.util.Arrays;

public class repsEqual {
	
	static int arrayEqual(int[] a,int digits) {
		int result = 0;
		
		int digit = digits;
		int length = 0;
		
		while(digit > 0) {
			digit /= 10;
			length++;
		}
		int[] digitArray=new int[length];
		
		while(digits > 0) {
			int remainder = digits%10;
			digitArray[length-1] = remainder;
			length--;
			digits /= 10;
		}
		
		result = (Arrays.equals(a,digitArray)) ? 1 : 0 ;
		return result;
	}
	
	public static void main(String args[]) {
		int[] a= {3,2,0,5,3};
		System.out.println(arrayEqual(a,32053));
		
		int[] b= {3,2,0,5};
		System.out.println(arrayEqual(b,32053));
		
		int[] c= {3,2,0,5,3,4};
		System.out.println(arrayEqual(c,32053));
		
		int[] d= {2,3,0,5,3};
		System.out.println(arrayEqual(d,32053));
		
		int[] e= {9,3,1,1,2};
		System.out.println(arrayEqual(e,32053));
	}

}
