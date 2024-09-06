package maharishi.test;

public class madhav {
	public static void main(String args[]) {
		System.out.println(calMadhArray(new int[] {2,1,1}));//1
		System.out.println(calMadhArray(new int[] {2,1,1,4,-1,-1}));//1
		System.out.println(calMadhArray(new int[] {6,2,4,2,2,2,1,5,0,0}));//1
		System.out.println(calMadhArray(new int[] {18,9,10,6,6,6}));//0
		System.out.println(calMadhArray(new int[] {-6,-3,-3,8,-5,-4}));//0
		System.out.println(calMadhArray(new int[] {0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1}));//1
		System.out.println(calMadhArray(new int[] {3,1,2,3,0}));//0
	}
	
	public static int calMadhArray(int[] a) {
		
		int i = 1;
		int total = 0;
		int count = 1;
		int index = 1;
		int firstTotal = a[0];
		
		boolean isValid = false;
		for(int n=0;n<a.length;n++) {
			if(a.length == n*(n+1)/2) {
				isValid = true;
				break;
			}
		}
		
		if(isValid == false) return 0;
		
		while(i < a.length) {	
			count += 1;
			total = 0;
			
			for(int j=0;j<count;j++) {
				total += a[index];
				index++;
			}	
			
			if(firstTotal != total ) return 0;
			i+=index;
		}
		
		return 1;
	}
}
