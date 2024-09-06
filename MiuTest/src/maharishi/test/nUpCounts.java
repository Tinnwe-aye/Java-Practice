package maharishi.test;

public class nUpCounts {
	public static void main(String args[]) {
		int[] nums1 = {2,3,1,-6,8,-3,-1,2};
		int n1 = 5;
		int count1 = nUpCount(nums1,n1);
		System.out.println(count1);
		
		int[] nums2 = {6,3,1};
		int n2 = 6;
		int count2 = nUpCount(nums2,n2);
		System.out.println(count2);
		
		
		int count3 = nUpCount(new int[] {1,2,-1,5,3,2,-3},20);
		System.out.println(count3);
	}
	public static int nUpCount(int[] nums,int n) {
		
		int total = 0;
		int count = 0;
		boolean partial = false;
		
		for(int i=0;i < nums.length; i++) {
			total += nums[i];
			if(total > n && partial == false) {
				count++;
				partial = true;
			} else if(total < n){
				partial = false;
			}
		}
		
		return count;
	}
}
