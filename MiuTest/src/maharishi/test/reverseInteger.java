package maharishi.test;

public class reverseInteger {
	public static void main(String args[]) {
		int n = -50021;
		int res = 0;
		int tmp = n;
		int remainder = 1;
		
		while(tmp != 0) {
			remainder = tmp % 10;
			res = (res * 10) + remainder;
			tmp /= 10;
		}
		
		System.out.println(res);
	}
}
