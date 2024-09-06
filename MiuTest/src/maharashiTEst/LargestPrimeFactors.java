package maharashiTEst;

import java.util.ArrayList;

public class LargestPrimeFactors {
	
	static int LargestPrimeFactor(int n) {
		int number = n;
		while(number > 1) {
			if(n%number == 0) {
				int isPrime=1;
				for (int i = 2; i < number; i++) {
		            if (number%i == 0 ) {
		            	isPrime=0;
		            	break;
		            }
		        }
				if(isPrime==1) return number;
			}
			
			number--;
		}
		return 0;
	}
	
	public static void main(String args[]) {
		
		System.out.println(LargestPrimeFactor(10));
		System.out.println(LargestPrimeFactor(6936));
		System.out.println(LargestPrimeFactor(1));
	}
}
