package SampleTest;

public class POE {
	static int a6(int[] a) 
	 { 
	     if (a.length < 3) return -1; 
	     int i = 0; 
	     int j = a.length - 1; 
	     int idx = 1; 
	     int leftSum = a[i]; 
	     int rightSum = a[j]; 
	     //{1, 8, 3, 7, 10, 2}
	     for (int k = 1; k < a.length - 2; k++) 
	     { System.out.println("leftSum: "+leftSum+"/"+"rightSum"+rightSum);
	         if (leftSum < rightSum) 
		    { 
			   i++; 
			   leftSum += a[i];
			   idx = i + 1; 
		    } 
		    else 
		    { 
			   j--; 
			   rightSum += a[j]; 
			   idx = j - 1; 
		    } 
	         
	         System.out.println(idx);
	      } 
	      if (leftSum == rightSum) 
	          return idx; 
	      else 
	          return -1;  
	 }
	public static void main(String args[]) {
		System.out.println(a6(new int[]{1, 8, 3, 7, 10, 2}));
	}
}
