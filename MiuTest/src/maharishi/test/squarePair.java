package maharishi.test;

public class squarePair {
	
	public static void main(String args[]) {
		System.out.println(countSquarePair(new int[] {11,5,4,20}));//3
		System.out.println("----------------------------");
		System.out.println(countSquarePair(new int[] {9,0,2,-5,7}));//2
		System.out.println("----------------------------");
		System.out.println(countSquarePair(new int[] {9}));//0
		System.out.println("----------------------------");

	}
	public static int countSquarePair(int[] a) {
		
		if(a.length <= 2 ) return 0;
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i != j) {
				
					double totalSquare = Math.sqrt(a[i]+a[j]);					
					if(a[i] < a[j] && a[i] > 0 && a[j] > 0 
							&& (int)totalSquare == (int)Math.floor(totalSquare) 
							&& (int)totalSquare==(int)Math.ceil(totalSquare)) {
						count++;
					}
				}
			}
		}		
		return count;
	}

}
