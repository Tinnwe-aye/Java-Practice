package MiuArabic;

public class palidromNumber {
	
	public static void main(String args[]) {
		System.out.println(calPalidrom(545));
	}

	static int calPalidrom(int n) {
		
		if(n == reverse(n)) {
			return 1;
		}
		return 0;
	}
		
	static int reverse(int n) {
		
		int tmp = n;
		int remainder = 1;
		int result = 0;
		
		while(tmp != 0) {
			remainder = tmp % 10;
			result = (result*10) + remainder;
			tmp /= 10;
		}
		
		return result;
	}

}
