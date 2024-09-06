package maharishi.test;

import java.util.Arrays;

public class Power{
    public static int calculatePower(int base,int power){
	int result = 1;    	
	while(power > 0){
	    result *= base;
	    power--;
	}
	return result;
    }
    public static void main(String args[]) {
		  int res = calculatePower(2,3);
		  System.out.println(res);
	  }
}
