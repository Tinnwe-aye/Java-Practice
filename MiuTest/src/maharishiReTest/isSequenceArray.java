package maharishiReTest;

public class isSequenceArray {
	static int IsSequenceArray(int[] a, int m,int n) {
		int result = 0;
		boolean isValid = false;
		if(a[0] == m && a[a.length-1] == n) {
			isValid = true;
		} 
		if(isValid == false) return 0;
		
		for(int i=0;i<a.length-1;i++) {
			int diff = a[i+1] - a[i];
			if(diff == 0 || diff==1) {
				result = 1;
			}else {
				result = 0;
				break;
			}
		}
		
		return result;
	}
	public static void main(String args[]) {
		System.out.println(IsSequenceArray(new int[] {1,2,3,4,5},1,5));
		System.out.println(IsSequenceArray(new int[] {1,3,4,2,5},1,5));
		System.out.println(IsSequenceArray(new int[] {-5,-5,-4,-4,-4,-3,-3,-2,-2,-2},-5,-2));
		System.out.println(IsSequenceArray(new int[] {0,1,2,3,4,5},1,5));
		System.out.println(IsSequenceArray(new int[] {1,2,3,4},1,5));
		System.out.println(IsSequenceArray(new int[] {1,2,5},1,5));
		System.out.println(IsSequenceArray(new int[] {5,4,3,1,2},1,5));
	}
}
