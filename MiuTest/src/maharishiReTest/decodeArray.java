package maharishiReTest;

public class decodeArray {
	
	static int decodeArrays(int[] a) {
		
		int total = 0;
		for(int i=0;i<a.length-1;i++) {
			int res=Math.abs(a[i]-a[i+1]);
			total = total*10+res;
		}
		if(a[0] < 0) total*= -1;
		return total;
	}
	
	public static void main(String args[]) {
		int[] a= {0,-3,0,-4,0};
		System.out.println(decodeArrays(a));
		int[] b= {-1,5,8,17,15};
		System.out.println(decodeArrays(b));
		int[] c= {1,5,8,17,15};
		System.out.println(decodeArrays(c));
		int[] d= {111,115,118,127,125};
		System.out.println(decodeArrays(d));
	}

}
