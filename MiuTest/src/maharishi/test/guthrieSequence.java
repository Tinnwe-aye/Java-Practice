package maharishi.test;

public class guthrieSequence {
	public static void main(String args[]) {
		
		System.out.println(isGuthrie(new int[]{8,4,2,1} ));
		System.out.println(isGuthrie(new int[] {8,17,4,1}));
		System.out.println(isGuthrie(new int[] {8,4,1}));
		System.out.println(isGuthrie(new int[] {8,4,2}));
	}
	
	static int isGuthrie(int[] a) {
		
		int guthNum = 0;
		for(int i=0; i< a.length-1;i++) {
			if(a[i] % 2 == 0 ) {
				guthNum = a[i] /2;
			} else {
				guthNum = 3*a[i]+1;
			}
			if(a[i+1] != guthNum) return 0;
		}
		
		return 1;
	}
}
