package MiuArabic;

public class matches {
	
	static int calculateMatches(int[] a,int[] p) {
		int result = 0;
		int num = 0;
		int index = 0;
		boolean match = true;
		
		for(int i=0;i<p.length;i++) {
			
			num = Math.abs(p[i]);
			int sign = (p[i] > 0 ) ? 1 : 0;
			if(sign == 1) {
				for(int j=0;j<num;j++) {
					if(a[index+j] < 0) {
						match = false;
						break;
					}
				}
			}else {
				for(int j=0;j<num;j++) {
					if(a[index+j] > 0) {
						match = false;
						break;
					}
				}
			}
			index += num;
			
		}
		result = (match == true) ? 1 : 0 ;
		return result;
	}
	
	public static void main(String args[]) {
		System.out.println(calculateMatches(new int[] {1,2,3,-5,-5,2,3,18},new int[] {2,1,-1,-1,2,1}));
		System.out.println(calculateMatches(new int[] {1,2,3,-5,-5,2,3,18},new int[] {1,2,-1,-1,1,2}));
		System.out.println(calculateMatches(new int[] {1,2,3,-5,-5,2,3,18},new int[] {4,-1,3}));
		System.out.println(calculateMatches(new int[] {1,2,3,-5,-5,2,3,18},new int[] {2,-3,3}));
		System.out.println(calculateMatches(new int[] {1,2,3,-5,-5,2,3,18},new int[] {2,1,-2,3}));
		System.out.println(calculateMatches(new int[] {1,2,3,-5,-5,2,3,18},new int[] {1,1,1,-1,-1,1,1,1}));
		System.out.println(calculateMatches(new int[] {1,2,3,-5,-5,2,3,18},new int[] {8}));
	}

}
