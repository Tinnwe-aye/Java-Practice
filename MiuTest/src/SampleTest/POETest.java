package SampleTest;

//Point of Equilibrium
public class POETest {
	public static void main(String args[]) {
		System.out.println(poe(new int[]{1, 8, 3, 7, 10, 2}));
	}
	
	public static int poe(int[] nums) {
		
		int i = 0;
		int j = nums.length-1;
		int leftSum = nums[i];
		int rightSum = nums[j];
		int idx = 1; 
		
		for(int k = 1; k < nums.length-2; k++) {
			if(leftSum < rightSum) {
				i++;
				leftSum += nums[i];
				idx = i + 1;
			} else {
				j--;
				rightSum += nums[j];
				idx = j - 1;
			}
		}
		
		if (leftSum == rightSum) 
	          return idx; 
	      else 
	          return -1; 
	}
}
