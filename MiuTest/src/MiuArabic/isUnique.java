package MiuArabic;

public class isUnique {
	
	static int calculateUnique(int[] a,int num) {
		int result =0;
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] + a[j] == num) count++;
			}
		}
		result = (count == 1) ? 1 : 0 ;
		return result;

	}
	
	public static void main(String args[]) {
		System.out.println(calculateUnique(new int[] {7,3,3,2,4},6));
		System.out.println(calculateUnique(new int[] {7,3,3,2,4},10));
		System.out.println(calculateUnique(new int[] {7,3,3,2,4},11));
		System.out.println(calculateUnique(new int[] {7,3,3,2,4},8));
		System.out.println(calculateUnique(new int[] {2,7,3,4},5));
		System.out.println(calculateUnique(new int[] {2,3,3,7},5));
	}

}
