package maharishi.test;

public class evenOddIncreases {
	public static void main(String args[]) {
		int[] nums = {1,6,3,4,8,2}; 
		int res = evenOddIncrease(nums);
		System.out.println(res);
	}
	public static int evenOddIncrease(int[] nums) {
		
		if(nums == null || nums.length < 4) return 0;
		int evenIndex = nums[0];
		int oddIndex = nums[1];

		for(int i=0;i<nums.length;i++) {
			if(i % 2 == 0 && evenIndex > nums[i]) {
				return 0;
			} else if(i % 2 != 0 && oddIndex < nums[i]){
				return 0;
			}
		}		
		return 1;
	}
}
 