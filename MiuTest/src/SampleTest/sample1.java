package SampleTest;

public class sample1 {
	
	static int test1(int[] a){
		
		if(a.length%2 == 0 )return 0;
		
		int index = a.length/2;
		int middle = a[index];
		
		for(int i=0;i<a.length;i++) {
			if( i != index) {
				if(middle >= a[i]) {
					return 0;
				}
			}
		}
		
		return 1;
	}
	
	public static void main(String args[]) {
		System.out.println(test1(new int[] {1,2,3,4,5}));
		System.out.println(test1(new int[] {3,2,1,4,5}));
		System.out.println(test1(new int[] {3,2,1,4,1}));
		System.out.println(test1(new int[] {1,2,3,4}));
		System.out.println(test1(new int[] {}));
		System.out.println(test1(new int[] {10}));
	}

}
