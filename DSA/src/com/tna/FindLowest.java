package com.tna;

public class FindLowest {
	public static void main(String args[]) {
		int[] my_array = {7, 12, 9, 4, 11};
		int min = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < my_array.length; i++) {
			if(min > my_array[i]) min = my_array[i];
		}
		
		System.out.println(min);
	}
}
