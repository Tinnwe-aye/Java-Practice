package maharishiReTest;

public class largestPrimeFactor {
	
	static int largestPrimeFactor(int n) {
		if(n <= 1) return 0;
		int num=n-1;
		int isPrime = 1;
		int largestFactorPrime = 0;
		while(num>1) {
			// check isfactor
			if(n%num == 0) {
				 // check is prime
				 for(int i=2;i<num;i++) {
					 if(num%i == 0) {
						 isPrime = 0;
						 break;
					 }else {
						 isPrime = 1;
					 }
				 }
				 
				 if(isPrime == 1) {
					 largestFactorPrime = num;
					 break;
				 }	
			 }
			num--;
		}
		return largestFactorPrime;
	}
	public static void main(String args[]) {
		System.out.println(largestPrimeFactor(10));
		System.out.println(largestPrimeFactor(6936));
		System.out.println(largestPrimeFactor(1));
	}

}
