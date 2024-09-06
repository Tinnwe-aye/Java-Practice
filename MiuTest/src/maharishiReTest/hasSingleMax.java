package maharishiReTest;

public class hasSingleMax {
	
	static int hasSingleMaximum(int[] a) {
		if(a.length == 0) return 0;
		int max = a[0];
		int duplicate = 0;
		
		for(int i=1;i<a.length;i++) {
			if(a[i] > max) {
				max = a[i];
				duplicate = 0;
			}else if(a[i]==max){
				duplicate = 1;
			}
		}
		return (duplicate == 0) ? 1 : 0;
	}
	
	public static void main(String args[]) {
		System.out.println(hasSingleMaximum(new int[] {1,2,3,1,0}));
		System.out.println(hasSingleMaximum(new int[] {18}));
		System.out.println(hasSingleMaximum(new int[] {1,2,3,0,1,3}));
		System.out.println(hasSingleMaximum(new int[] {13,1,13,2,13,0,13,1,13}));
		System.out.println(hasSingleMaximum(new int[] {}));
		System.out.println(hasSingleMaximum(new int[] {-6,-6,-6,-6,-6,-6,-6}));
	}

}
