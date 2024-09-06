package maharishiReTest;

public class LargestAdjustSum {
	static int LargestAdjustSum(int[] a) {
		
		int max = 0;
		int total = 0;
		
		for(int i=0;i<a.length-1;i++) {
			total = a[i]+a[i+1];
			if(total > max) max=total;
		}
		return max;
	}
	
	public static void main(String args[]) {
		System.out.println(LargestAdjustSum(new int[] {1,2,3,4}));
	}
}
