package MiuArabic;

public class reverseInteger {
	
	static int reverse(int a) {
	
		int reversed = 0;
		while(a != 0) {
			int remainder = a%10;
			reversed = reversed * 10 + remainder; 
			a/=10;
		}
		
		return reversed;
	}
	

	public static void main(String args[]) {
		System.out.println(reverse(123));
		System.out.println(reverse(12005));
		System.out.println(reverse(1));
		System.out.println(reverse(1000));
		System.out.println(reverse(0));
		System.out.println(reverse(-12345));
	}

}
