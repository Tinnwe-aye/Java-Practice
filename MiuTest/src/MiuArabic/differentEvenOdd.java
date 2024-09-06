package MiuArabic;

public class differentEvenOdd {
	
	static int diffEvenOdd(int[] a) {
		int result = 0;
		int evenTotal = 0;
		int oddTotal = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] != 0 ) {
				if(a[i]% 2 == 0) {
					evenTotal += a[i];
				}else {
					oddTotal += a[i];
				}
			}
		}
		result = oddTotal - evenTotal;
		return result;
	}
	
	public static void main(String args[]) {
		int[] a={1,2,3};
		System.out.println(diffEvenOdd(a));
		
		int[] b={3,3,4,4};
		System.out.println(diffEvenOdd(b));
		
		int[] c={3,2,3,4};
		System.out.println(diffEvenOdd(c));
		
		int[] d={1,1};
		System.out.println(diffEvenOdd(d));
		
		int[] e={};
		System.out.println(diffEvenOdd(e));
	}

}
