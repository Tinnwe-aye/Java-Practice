package SampleTest;

public class sample2{
	
	static int addAndEven(int[] a) {
		
		if(a.length == 0 || a==null) return 0;
		
		int Y = 0;
		int X = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2 == 0) {
				Y +=a[i];
			}else {
				X+=a[i];
			}
		}
		
		return X-Y;
	}
	public static void main(String args[]) {
		System.out.println(addAndEven(new int[] {1}));
		System.out.println(addAndEven(new int[] {1,2}));
		System.out.println(addAndEven(new int[] {1,2,3}));
		System.out.println(addAndEven(new int[] {1,2,3,4}));
		System.out.println(addAndEven(new int[] {3,3,4,4}));
		System.out.println(addAndEven(new int[] {3,2,3,4}));
		System.out.println(addAndEven(new int[] {4,1,2,3}));
		System.out.println(addAndEven(new int[] {1,1}));
		System.out.println(addAndEven(new int[] {}));
	}
}
