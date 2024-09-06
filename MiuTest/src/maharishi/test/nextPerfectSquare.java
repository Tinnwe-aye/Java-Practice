package maharishi.test;

public class nextPerfectSquare {
	public static void main(String args[]) {
		System.out.println(nextSquare(6));
	}
	public static int nextSquare(int n) {
		
		if(n < 0) return 0;
		if(n == 0) return 1;
		
		int num = 0;		
		for(int i = 1;i < n*n; i++) {
			if(i*i > n){
				num = i*i;
				break;
			}			
		}		
		return num;
	}
}
