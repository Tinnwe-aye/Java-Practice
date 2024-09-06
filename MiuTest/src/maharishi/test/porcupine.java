package maharishi.test;

public class porcupine {
	public static void main(String args[]) {
		System.out.println(findPorcupine(139));
	}
	
	public static int findPorcupine(int n) {
		
		int porcupine = 0 ;
		int reqNumber = n+1;
		int currentPrime = 0;
		int nextPrime = 0;
		
		while(true) {	
			boolean prime = isPrime(reqNumber);		
			if(!prime) {
				reqNumber++;
				continue;				
			}			
			if(reqNumber % 10 == 9) {
				if(currentPrime == 0) {
					currentPrime = reqNumber;					
				} else {
					nextPrime = reqNumber;
					return currentPrime;
				}
			}else {
				currentPrime = 0;
			}
			reqNumber++;
		}		
	}
	
	public static boolean isPrime(int n) {
		
		if(n <= 1) return false;
		if(n == 2 || n == 3) return true;
		if(n % 2 == 0 || n % 3 == 0) return false;		
	
		for(int i = 5; i*i <= n; i+=6) {
			if(n%i == 0 || n % (i+2) == 0) return false;
		}
		return true;
	}
}
// porcupine sample - must be first prime is ending with 9 and consequence next prime also end with 9
