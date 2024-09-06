package SampleTest;

public class sample4 {
	
	static int reverseInt(int n) {

		int reverse = 0;
		while(n != 0) {
			int num = n%10;
			
			reverse = reverse * 10+num;
			n/=10;
		}
		return reverse;
	}
	
	public static void main(String args[]) {
		System.out.println(reverseInt(1234));
		System.out.println(reverseInt(12005));
		System.out.println(reverseInt(1));
		System.out.println(reverseInt(1000));
		System.out.println(reverseInt(0));
		System.out.println(reverseInt(-12345));
	}

}
