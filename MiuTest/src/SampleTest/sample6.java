package SampleTest;

public class sample6 {
	
	static int POE(int[] a) {
		
		int totalSum = 0;
        for (int i = 0; i < a.length; i++) {
            totalSum += a[i];
        }
        
        int leftSum = 0;
        for (int x=0; x<a.length; x++) {
        	if(leftSum == totalSum - leftSum - a[x]){
        		return x;
        	}
        	
        	leftSum += a[x];
        }
	    
		return -1;
	}
	public static void main(String args[]) {
		System.out.println(POE(new int[] {1, 8, 3, 7, 10, 2}));
		System.out.println(POE(new int[] {1, 5, 3, 1, 1, 1, 1, 1, 1}));
		System.out.println(POE(new int[] {2, 1, 1, 1, 2, 1, 7}));
		System.out.println(POE(new int[] {1, 2, 3}));
		System.out.println(POE(new int[] {3, 4, 5, 10}));
		System.out.println(POE(new int[] {1, 2, 10, 3, 4}));
	}
}
