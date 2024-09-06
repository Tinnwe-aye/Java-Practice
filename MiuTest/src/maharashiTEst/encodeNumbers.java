package maharashiTEst;

import java.util.ArrayList;

public class encodeNumbers {
	
	static ArrayList encodeNumbers(int n) {
		
		ArrayList res=new ArrayList<>();
		if(n<=1) res=null;
		
		for(int i=2;i<=n;i++) {
			while(n%i == 0) {
				res.add(i);
				n=n/i;
			}
		}
		
		return res;
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
