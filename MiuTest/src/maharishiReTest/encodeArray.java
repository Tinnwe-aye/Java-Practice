package maharishiReTest;

import java.util.ArrayList;

public class encodeArray {
	
	static ArrayList encodeNumbers(int n) {
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i=2;i<=n;i++) {
			while(n%i == 0) {				
				a.add(i);
				n=n/i;
			}
		}
		
		return a;
	}
	public static void main(String args[]) {
		
		System.out.println(encodeNumbers(2));
		System.out.println(encodeNumbers(6));
		System.out.println(encodeNumbers(14));
		System.out.println(encodeNumbers(24));
		System.out.println(encodeNumbers(1200));
		System.out.println(encodeNumbers(1));
		System.out.println(encodeNumbers(-18));
	}

}
