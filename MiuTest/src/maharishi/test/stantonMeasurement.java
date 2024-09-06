package maharishi.test;

public class stantonMeasurement {
    public static void main(String[] args) {        
    	
    	int[] a = {1};
        System.out.println(calculateStantonMeasure(a));
        
        
        int[] b = {0};
        System.out.println(calculateStantonMeasure(b));
        
        
        int[] c = {3,1,1,4};
        System.out.println(calculateStantonMeasure(c));
        
        int[] d = {1,3,1,1,3,3,2,3,3,3,4};
        System.out.println(calculateStantonMeasure(d));
        
        int[] e = {};
        System.out.println(calculateStantonMeasure(e));
    }
    
    static int calculateStantonMeasure(int[] a) {
    	
    	int firstOccurance = 0;
    	int secondeOccurance = 0;
    	
    	for(int i=0; i < a.length ; i++) {
    		if(a[i] == 1) {
    			firstOccurance++;
    		}
    	}

    	for(int i=0; i < a.length ; i++) {
    		if(a[i] == firstOccurance) {
    			secondeOccurance++;
    		}
    	}
    	
    	return secondeOccurance;
    }
}
