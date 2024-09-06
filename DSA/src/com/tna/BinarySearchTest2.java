package com.tna;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTest2 {
	public static void main(String args[]) {		
		System.out.println(BinarySearch(new int[] {2,3,7,11,15,25},7));			
	}
	
	static int BinarySearch(int[] nums,int target) {
		int left = 0;
		int right = nums.length - 1;
		
		while(left < right) {
			int mid = (left + right)/2;
			
			if(target == nums[mid]) return mid;
			if(target > nums[mid]) {
				left = mid + 1;
			} else {
				right = mid -1;
			}			
		}		
		return -1;
	}
}
