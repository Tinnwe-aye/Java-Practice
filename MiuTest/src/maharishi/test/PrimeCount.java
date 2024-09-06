package maharishi.test;

public class PrimeCount {
	public static void main(String args[]) {
		System.out.println(numberOfPrime(11,29));
	}
	public static int numberOfPrime(int start,int end) {
		if(start < 0 && end >= 2) start = 2;
		int count = 0;	
		while(start <= end)	{
			if(isPrime(start)) {
				System.out.println(start);
				count++;
			}			
			start++;
		}
		return count;		
	}
	
	public static boolean isPrime(int n) {
		boolean prime = true;
		for(int i=2;i<n;i++) {
			if(n % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}
