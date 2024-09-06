package maharishiReTest;

public class is235Arrays {
	
	static int is235Array(int[] a) {
		int cnt2=0;
		int cnt3=0;
		int cnt5=0;
		int not235=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) cnt2++;
			if(a[i]%3 == 0) cnt3++;
			if(a[i]%5 == 0) cnt5++;
			if(a[i]%2 != 0 && a[i]%3 != 0 && a[i]%5 != 0) {
				not235++;
			}
		}

		if(cnt2+cnt3+cnt5+not235 != a.length) return 0;
		return 1;
	}
	
	public static void main(String args[]) {
		System.out.println(is235Array(new int[] {2,3,5,7,11}));
		System.out.println(is235Array(new int[] {2,3,6,7,11}));
		System.out.println(is235Array(new int[] {2,3,4,5,6,7,8,9,10}));
		System.out.println(is235Array(new int[] {2,4,8,16,32}));
		System.out.println(is235Array(new int[] {3,9,27,7,1,1,1,1,1}));
		System.out.println(is235Array(new int[] {7,11,77,49}));
		System.out.println(is235Array(new int[] {2}));
		System.out.println(is235Array(new int[] {}));
		System.out.println(is235Array(new int[] {7,2,7,2,7,2,7,2,3,7,7}));
	}

}
