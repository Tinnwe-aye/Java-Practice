package MiuArabic;

public class isMadhavArray {
	
	static int calMadhArray(int[] a) {
		int result = 1;
		int firstNum = a[0];
		int count = 1;
		int i=1;
		boolean validArrayLength = false;
		
		for(int n=0;n<a.length;n++) {
			if(a.length == (n*(n+1))/2) {
				validArrayLength = true;
				break;
			}
		}
		
		if(validArrayLength == false ) return 0;

			while(i<a.length) {
				int index = i; //1//3
				count += 1;//3
				int total = 0;
				
				for(int j=0;j<count;j++) {
					total += a[index+j];
				}
				
				if(firstNum != total) {
					result = 0 ;
					break;
				}
				
				i=index+count;//3//6
			}
		
		return result;
	}
	
	public static void main(String args[]) {
		System.out.println(calMadhArray(new int[] {2,1,1}));
		System.out.println(calMadhArray(new int[] {2,1,1,4,-1,-1}));
		System.out.println(calMadhArray(new int[] {6,2,4,2,2,2,1,5,0,0}));
		System.out.println(calMadhArray(new int[] {18,9,10,6,6,6}));
		System.out.println(calMadhArray(new int[] {-6,-3,-3,8,-5,-4}));
		System.out.println(calMadhArray(new int[] {0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1}));
		System.out.println(calMadhArray(new int[] {3,1,2,3,0}));
	}

}
