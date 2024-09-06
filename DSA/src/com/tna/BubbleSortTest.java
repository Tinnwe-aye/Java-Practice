package com.tna;

import java.util.Arrays;

public class BubbleSortTest {
	public static void main(String args[]) {		
		int[] result = BubbleSort(new int[] {3,25,2,7,15,11});	
		System.out.println(Arrays.toString(result));
	}
	static int[] BubbleSort(int[] nums) {
		
		for(int i = 0; i < nums.length-1; i++) {
			for(int j = 0; j < nums.length-i-1; j++) {
				if(nums[j] > nums[j+1]) {
					int tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}
			}
		}
		
		return nums;
	}
}
