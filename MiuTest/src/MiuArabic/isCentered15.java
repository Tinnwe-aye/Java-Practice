package MiuArabic;

public class isCentered15 {
	
	static int isCenter(int[] a) {
		int result = 0;
		if(a.length == 0) return 0;
		
		int total = 0;
		for(int i=0;i<a.length;i++) {
			total += a[i];
		}
		int start = 0;
		int end = a.length-1;
		while(start < end) {
			total = total - a[start] - a[end] ;
			if(total == 15) result = 1;
			start++;
			end--;
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		int[] a = {3,2,10,4,1,6,9};
		System.out.println(isCenter(a));
		
		int[] b = {2,10,4,1,6,9};
		System.out.println(isCenter(b));
		
		int[] c = {3,2,10,4,1,6};
		System.out.println(isCenter(c));
		
		int[] d = {1,1,8,3,1,1};
		System.out.println(isCenter(d));
		
		int[] e = {9,15,6};
		System.out.println(isCenter(e));
		
		int[] f = {1,1,2,2,1,1};
		System.out.println(isCenter(f));
		
		int[] g = {1,1,15,-1,-1};
		System.out.println(isCenter(g));
	}
}
