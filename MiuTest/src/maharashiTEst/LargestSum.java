package maharashiTEst;

import java.util.Arrays;

class LargestSumAlgorithm{
	public int LargestAdjacentSum(int[] a){
		int max = 0;
		
		for(int i=0;i<a.length-1;i++) {
			int total = a[i]+a[i+1];
			max = (total > max) ? total : max ;
		}
		return max;
	}
}
	
public class LargestSum {
	public static void main(String args []) {
		
		// int[] a= {1,2,3,4}; // 7
		// int[] a= {18,-12,9,-10}; // 6
		// int[] a= {1,1,1,1,1,1,1,1,1}; // 2
		int[] a= {1,1,1,1,1,2,1,1,1}; // 3
		
		
		LargestSumAlgorithm algorithm=new LargestSumAlgorithm();
		System.out.println(algorithm.LargestAdjacentSum(a));
		
	}

}
