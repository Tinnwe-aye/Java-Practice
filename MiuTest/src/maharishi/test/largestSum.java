package maharishi.test;

public class largestSum {
	public static void main(String args[]) {
		int[] a= {1,2,3,4};
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<a.length-1;i++) {
			sum = a[i] + a[i+1];
			if(sum > max) max = sum;
		}
		
		System.out.println(max);
	}
}
