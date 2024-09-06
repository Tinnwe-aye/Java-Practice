package MiuArabic;

import java.util.HashMap;
import java.util.Map;

//find 1 and if find, get count occurance(2) , then find count occurance(2) , find occurance of that value 
public class stantonMesurement {

    public static int calculateStantonMeasure(int[] array) {
     
        int occuranceOne = 0;
        int stanton = 0;
        
        for(int i=0;i<array.length;i++) {
        	if(array[i] == 1) {
        		occuranceOne++;
        	}
        }
        
        for(int i=0;i<array.length;i++) {
        	if(array[i] == occuranceOne) {
        		stanton++;
        	}
        }
         return stanton;
    }
    
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
}
