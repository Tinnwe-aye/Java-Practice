package maharishi.test;

import java.util.LinkedHashSet;

public class inertial {
	public static void main(String args[]) {
		System.out.println(calInertial(new int[] {1}));//0
//		System.out.println("----------------------------");
		System.out.println(calInertial(new int[] {2}));//0
//		System.out.println("----------------------------");
		System.out.println(calInertial(new int[] {1,2,3,4}));//0
//		System.out.println("----------------------------");
		System.out.println(calInertial(new int[] {1,1,1,1,1,1,2}));//1
//		System.out.println("----------------------------");
		System.out.println(calInertial(new int[] {2,12,4,6,8,11}));//1
//		System.out.println("----------------------------");
		System.out.println(calInertial(new int[] {2,12,12,4,6,8,11}));//1
//		System.out.println("----------------------------");
		System.out.println(calInertial(new int[] {-2,-4,-6,-8,-11}));//0
//		System.out.println("----------------------------");
		System.out.println(calInertial(new int[] {2,3,5,7}));//0
//		System.out.println("----------------------------");
		System.out.println(calInertial(new int[] {2,4,6,8,10}));//0
//		System.out.println("----------------------------");
	}
	
	public static int calInertial(int[] a) {
		
		boolean isExistOdd = false;
		boolean isMaxEven = true;
		boolean isGreaterOdd = true;
		
		int max = Integer.MIN_VALUE;
		LinkedHashSet<Integer> odd = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> even = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> maxArray = new LinkedHashSet<Integer>();
		
		for(int n:a) {
			if(n%2 != 0) {
				isExistOdd = true;
				odd.add(n);
			}else {
				even.add(n);
			}
			if(n > max) {
				max = n;
			}
		}

		if(max % 2 != 0) isMaxEven = false;
		if(isMaxEven == true && even.contains(max) && a.length > 1) {
			even.remove(max);
		}

		for(int i:odd) {
			for(int e:even) {
				if(i < e ) isGreaterOdd = false;
			}
		}
		
		return (isExistOdd && isMaxEven && isGreaterOdd) ? 1 : 0;
	}
}
