package MiuArabic;

import java.util.ArrayList;
import java.util.Arrays;

public class solve10 {
	
	static ArrayList calculateSolve10() {
		ArrayList<Integer> a = new ArrayList<>();

		int total = 0;
		int tenfactor=1;
		int factor = 10;
		
			for(int f = 0; f < factor ; f++ ) {
				tenfactor *= factor-f; 
			}
			
			for(int x=1;x<10;x++) {
				int xfactor = calulateFactor(x);
				for(int y=1;y<10;y++) {
					
					int yfactor = calulateFactor(y);
					if(xfactor + yfactor == tenfactor) {
						a.add(x);
						a.add(y);
					}
				}
			}
	
		return a;
	}
	
	static int calulateFactor(int n) {
		int factor = 1;
		
		for(int f = 0; f < n ; f++ ) {
			factor *= n-f;
		}
		
		return factor;
	}
	
	public static void main(String args[]) {
		ArrayList<Integer>  res = calculateSolve10();
		if(res.size() == 0 ) 
		{
			System.out.println("not match.");
		}else {
			System.out.println(res);
		}
		
	}

}
