package com.tna;

import java.util.Arrays;

/**
 * Select one index, compare by loop , put smallest into selected index
 * @param args
 */
public class SelectionSort {
	public static void main(String args[]) {
		int[] nums = { 7, 12, 9, 11, 3};
		
		for(int i = 0 ; i < nums.length-1; i++) {		
			int minIndex = i;
			
			for(int j = i + 1 ; j < nums.length; j++) {
				if(nums[minIndex] > nums[j]) {
					minIndex = j;
				}
			}
			int tmp = nums[minIndex];
			nums[minIndex] = nums[i];				
			nums[i] = tmp;
			System.out.println(Arrays.toString(nums));
		}
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(nums));
	}
}
