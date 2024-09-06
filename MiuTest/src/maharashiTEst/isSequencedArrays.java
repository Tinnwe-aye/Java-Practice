package maharashiTEst;

public class isSequencedArrays {
	
	static int isSequencedArray(int[] a, int m, int n) {
		
		boolean ascend = isSorted(a);
		
		if(ascend) {
			int length = a.length;
			if (a[0]!=m || a[length-1]!=n) return 0;
			
			for(int i=0;i<a.length-1;i++) {
				if(a[i+1]-a[i] !=0 && a[i+1]-a[i]!=1) {
					return 0;
				}
			}
		}else {
			return 0;
		}
		
		return 1;
		
	}
	
	static boolean isSorted(int[] array) {
		
		for(int x=0;x<array.length-1;x++) {
			if(array[x] > array[x+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		int[] a= {-5,-5,-4,-4,-4,-3,-3,-2,-2};
		System.out.println(isSequencedArray(a,-5,-2));
	}

}
