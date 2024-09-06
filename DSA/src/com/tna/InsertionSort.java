package com.tna;

import java.util.Arrays;

/**
 * Sort by going backward , select one key , search backward like bubble and send smallest to first
 * @param args
 */
public class InsertionSort {
    public static void main(String[] args) {
       int[] nums = {12, 11, 13, 5, 6};
       
       for(int i = 1 ; i < nums.length; i++) {	
    	   int key = nums[i];
    	   int j = i - 1;
    	   
    	   while(j >= 0 && nums[j] > key) {
    		  nums[j+1] = nums[j];
    		  j--;
    	   }
    	   
    	   nums[j+1] = key;
    	   System.out.println(Arrays.toString(nums));
       }
       
       System.out.println("Sorted Array");
       System.out.println(Arrays.toString(nums));
    }
}
