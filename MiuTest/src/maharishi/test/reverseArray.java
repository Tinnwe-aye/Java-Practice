package maharishi.test;

import java.util.Arrays;

public class reverseArray{
	  static String[] reverse(String[] str){
	  	int left = 0;
		int right = str.length-1;

		while ( left < right){
		  String tmp = str[left];
		  str[left] = str[right];
	          str[right] = tmp;
	          
	          left++;
	          right--;
		}
		
		return str;
	  }
	  public static void main(String args[]) {
		  String[] res = reverse(new String[] {"abc","def","ghi","jkl","mno"});
		  System.out.println(Arrays.toString(res));
	  }

	}
