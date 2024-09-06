package maharishi.test;

public class calculateConvertToBase {
	public static void main(String args[]) {
		System.out.println(converToBase(new int[] {1,0,1,1},2));
		System.out.println(converToBase(new int[] {1,1,2},3));
		System.out.println(converToBase(new int[] {3,2,5},8));
		System.out.println(converToBase(new int[] {3,7,1},6));
	}
	
	public static int converToBase(int[] a,int base) {
			
		int total = 0;
		for(int i = 0; i < a.length;i++) {		
			if(a[i] > base) return 0;
			int j = a.length-1-i;
			int power = 1;			
			while(j > 0) {
				power *= base;
				j--;
			}			
			total += a[i] * power;			
		}
		return total;
	}
}
