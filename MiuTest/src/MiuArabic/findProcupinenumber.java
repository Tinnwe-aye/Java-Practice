package MiuArabic;

import java.util.ArrayList;

public class findProcupinenumber {
	
	static int calProcuPine(int n) {
		int result =0;
		ArrayList<Integer> a= new ArrayList<>();
		
		int max = Integer.MAX_VALUE;
		int num=n+1;
		
		int prime = 0;
		int proPrime = 0;
		
		int cnt = 0;
	
			while(num < max){
				int isPrime = 1;
				int j = 2;
				while(j < num) {
					if(num % j == 0) {
						isPrime = 0;
						break;
					}
					j++;
				}
				if(isPrime == 1) {
					a.add(num);
					cnt++;
					if(a.size()> 1) {
						if(a.get(cnt-2) % 10 == 9 && a.get(cnt-1) % 10 == 9) {
							proPrime = a.get(cnt-2);
							break;
						}
							
					}
				}
				
				num++;
			}

		
		return proPrime;
	}
	
	public static void main(String args[]) {
		System.out.println(calProcuPine(139));
	}

}
