package MiuArabic;

public class isSquare {
	
	static int calculateIsSquare(int num) {
		int result = 0;
		if(num == 0 ) return 1;
		for(int i=0;i<num;i++) {
			System.out.println(1);
			if(i*i == num) {
				result = 1;
				break;
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		//System.out.println(calculateIsSquare(4));
		System.out.println(calculateIsSquare(25));
//		System.out.println(calculateIsSquare(-4));
//		System.out.println(calculateIsSquare(6));
//		System.out.println(calculateIsSquare(0));
	}

}
