package maharishiReTest;

public class checkConcatinateSum {
	
	static int checkConcatinateSum(int num,int n) {
		
		int total = 0 ;
		int number = num;
		while(number > 0) {
			int remainder = number%10;
			int digit = 0;
			for(int i=0;i<n;i++) {
				digit = digit*10+remainder;
			}
			
			total += digit;
			
			number=number/10;
		}
		
		return (total==num) ? 1 : 0;
	}
	public static void main(String args[]) {
		System.out.println(checkConcatinateSum(198,2));
		System.out.println(checkConcatinateSum(198,3));
		System.out.println(checkConcatinateSum(2997,3));
		System.out.println(checkConcatinateSum(2997,2));
		System.out.println(checkConcatinateSum(13332,4));
		System.out.println(checkConcatinateSum(9,1));
	}

}
