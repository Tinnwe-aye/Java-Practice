package maharashiTEst;

public class CheckContenatedSum {
	static int n = 0;
	static int catlen = 0;
	
	static int checkContanetedSum(int n, int catlen) {
		int original = n;
		int res=0;
		int total = 0;
		int remainer;
		
		while(n!=0) {
			remainer = n%10;
			int num=0;
			for(int i=0;i<catlen;i++) {
				num=(num*10)+remainer;
			}
			total += num;
			n=n/10;
		}

		res = (original==total) ? 1 : 0 ;
		return res;
	}
	
	public static void main(String args[]) {
		
		System.out.println(checkContanetedSum(2997,3));
	}
	
}
