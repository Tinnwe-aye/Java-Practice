package com.tna;

public class LinearSearch {
	 public static void main(String[] args) {
		int[] nums = {12, 8, 9, 11, 5, 11};
		int target = 9;
		
		System.out.println(LinearSearchFun(nums,target));
	 }
	 static int LinearSearchFun(int[] nums,int target) {
		 for(int i = 0; i < nums.length; i++) {
				if(nums[i] == target) {
					return i;
				}
			}
		 return -1;
	 }
}
