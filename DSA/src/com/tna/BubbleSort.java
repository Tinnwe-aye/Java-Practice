package com.tna;

import java.util.Arrays;

/**
 * Send the biggest numbers to last
 * @param args
 */
public class BubbleSort {
	public static void main(String args[]) {
		int[] nums = { 7, 12, 9, 11, 3};
		for(int i = 0 ; i < nums.length - 1; i++) {			
			for(int j = 0 ; j < nums.length -i - 1; j++) {		
				if(nums[j] > nums[j+1]) {
					int tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}				
			}
			System.out.println(Arrays.toString(nums));
		}
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(nums));
	}
}
