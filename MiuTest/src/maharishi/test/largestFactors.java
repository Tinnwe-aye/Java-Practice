package maharishi.test;

public class largestFactors {
	public static void main(String args[]) {
		int n = 00012;
		System.out.println(n);
		int res = largestFactor(n);
		System.out.println(res);
	}
	public static int largestFactor(int n) {
		
		if(n <= 0) return 0;
		
		Integer res = null;
		for(int i = n-1;i > 0;i--) {
			if(n % i == 0) {
				res = i;
				break;
			}
		}
		
		return res;
	}
}
