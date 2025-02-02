package maharishiReTest;

import java.util.Arrays;

public class integerBaseRounding {
	static void doIntegerBaseRoundings(int[] a,int n) {
		if(n<=0) return;
		for(int i=0;i<a.length;i++) {
			int lower = (a[i]/n)*n;
			int upper = lower + n;
			
			int difflower = Math.abs(a[i]-lower);
			int diffupper = Math.abs(a[i]-upper);
			
			if(difflower < diffupper) {
				a[i] = lower;
			}else {
				a[i] = upper;
			}
		}
		
	}
	public static void main(String args[]) {
		
		int[] a = {1,2,3,4,5};
		doIntegerBaseRoundings(a,3);
		System.out.println(Arrays.toString(a));
		
		int[] b = {1,2,3,4,5};
		doIntegerBaseRoundings(b,-3);
		System.out.println(Arrays.toString(b));
		
		int[] c = {-1,-2,-3,-4,-5};
		doIntegerBaseRoundings(c,3);
		System.out.println(Arrays.toString(c));
		
		int[] d = {-18,1,2,3,4,5};
		doIntegerBaseRoundings(d,4);
		System.out.println(Arrays.toString(d));
		
		int[] e = {1,2,3,4,5};
		doIntegerBaseRoundings(e,5);
		System.out.println(Arrays.toString(e));
		
		int[] f = {1,2,3,4,5};
		doIntegerBaseRoundings(f,100);
		System.out.println(Arrays.toString(f));
	}
}
