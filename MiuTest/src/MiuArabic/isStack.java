package MiuArabic;

public class isStack {
	
	static int calculateisStack(int n) {
		int result = 0;
		
		int i = 1;
		int total = 0;
		while(i <= n) {
			total += i;
			if(total == n) {
				result = 1;
			}
			i++;
		}
		
		return result;
	}
	
	
	public static void main(String args[]) {
		
		System.out.println(calculateisStack(1));
		System.out.println(calculateisStack(2));
		System.out.println(calculateisStack(3));
		System.out.println(calculateisStack(4));
		System.out.println(calculateisStack(5));
		System.out.println(calculateisStack(6));
		System.out.println(calculateisStack(7));
		System.out.println(calculateisStack(8));
		System.out.println(calculateisStack(9));
		System.out.println(calculateisStack(10));
		System.out.println(calculateisStack(15));
		
	}
}
