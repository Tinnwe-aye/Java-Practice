package maharishi.test;

public class PrintMapElements {
	static void print(int[] a, int n) {
		for(int i=0; i<a.length;i++) {
			if(a[i] == n) System.out.println(a[i]);
		}
	}
	
	public static void main(String args[]) {
		print(new int[] {1,3,1,5,6,5,5},5);
	}
}
