package maharishi.test;

public class center15 {
    public static void main(String[] args) {
    		System.out.println(isCenter(new int[]{3,2,10,4,1,6,9} ));    		
    		System.out.println(isCenter(new int[] {2,10,4,1,6,9}));    		
    		System.out.println(isCenter(new int[] {3,2,10,4,1,6}));    		
    		System.out.println(isCenter(new int[] {1,1,8,3,1,1}));    		
    		System.out.println(isCenter(new int[] {9,15,6}));    		
    		System.out.println(isCenter(new int[] {1,1,2,2,1,1}));    		
    		System.out.println(isCenter(new int[] {1,1,15,-1,-1}));
    }
    
    static int isCenter(int[] a){
    	
    	if(a.length == 0) return 0;
    	int total = 0 ;
    	
    	for(int n: a) {
    		total += n;
    	}
    	
    	int start = 0;
    	int end = a.length-1;
    	
    	while( start < end) {
    		total = total - a[start] - a[end];
    		if(total == 15) return 1;
    		start++;
    		end--;
    	}    	
		return 0;
	}
}
