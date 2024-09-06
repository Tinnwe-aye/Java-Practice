package maharashiTEst;

public class isCubePowerful {
	
	static int isCube(int n) {
		int res = 0;
		if(n <= 0) return 0;
		int originalNumber = n;
		
		while(n > 0) {
			int remainder = n%10;
			
			res +=remainder * remainder * remainder;
			
			n=n/10;
		}
		res = (res == originalNumber) ? 1 : 0;
		return res;
	}
	
	public static void main(String args[]) {
		
		System.out.println(isCube(153));
		System.out.println(isCube(370));
		System.out.println(isCube(371));
		System.out.println(isCube(407));
		System.out.println(isCube(87));
		System.out.println(isCube(0));
		System.out.println(isCube(81));
		
	}

}
