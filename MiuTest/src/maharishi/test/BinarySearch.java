package maharishi.test;

public class BinarySearch {
	static boolean binaryS(int[] nums,int n) {
		
		int left = 0;
		int right = nums.length-1;
		
		while(left <= right) {
			int mid = (left+right) / 2;
			   if(n == nums[mid]) {
				   return true;
			   }			   
			   if(n > nums[mid] ) {
				   left = mid + 1;
			   } else {
				   right = mid - 1;
			   }
		}
		return false;
	}
	public static void main(String args[]) {
		System.out.println(binaryS(new int[] {0,1,1,1},1));
		System.out.println(binaryS(new int[] {1,1,2},2));
		System.out.println(binaryS(new int[] {2,3,5},8));
		System.out.println(binaryS(new int[] {1,3,7},7));
	}
}
