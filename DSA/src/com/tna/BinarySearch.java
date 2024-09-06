package com.tna;

class BinarySearch {
	
	public static void main(String args[]) {
		
		int[] nums = {2,3,7,7,11,15,25};
		int target = 25;
		System.out.println(BinarySearchFun(nums,target));
		
	}

	static int BinarySearchFun(int[] nums, int target) {
	
		int left = 0;
		int right = nums.length - 1;		
		
		while(left <= right) {
			int mid = (left + right)/2;
			
			if(nums[mid] == target) return mid;
			
			if(nums[mid] < target) left = mid + 1;
				
			if(nums[mid] > target) right = mid - 1;
		}
		
		return -1;
	}
}
