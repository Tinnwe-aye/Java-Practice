package MiuArabic;

public class convertToBase10 {
	
	static int calculateConvertToBase10(int[] a,int base) {
		int result = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] > base) return 0;
			int j = i;
			int total = 1;
			while(j > 0) {
				total *= base;
				j--;
			}
			
			result += total * a[a.length-1-i];
		}
		return result;
	}
	
	public static void main(String args[]) {
		System.out.println(calculateConvertToBase10(new int[] {1,0,1,1},2));
		System.out.println(calculateConvertToBase10(new int[] {1,1,2},3));
		System.out.println(calculateConvertToBase10(new int[] {3,2,5},8));
		System.out.println(calculateConvertToBase10(new int[] {3,7,1},6));
	}

}
