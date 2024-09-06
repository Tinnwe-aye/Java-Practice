package MiuArabic;

public class isDivisible {
	
	static int isDivisibleInt(int[] a,int divisor) {
		int result = 1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%divisor != 0) {
				result = 0;
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		int[]  a= {3,3,6,36};
		System.out.println(isDivisibleInt(a,3));
		
		int[]  b= {4};
		System.out.println(isDivisibleInt(b,2));
		
		int[]  c= {3,4,3,6,36};
		System.out.println(isDivisibleInt(c,3));
		
		int[]  d= {6,12,24,36};
		System.out.println(isDivisibleInt(d,12));
		
		int[]  e= {};
		System.out.println(isDivisibleInt(e,3));
	}

}
