package SampleTest;

import java.util.Arrays;

public class sample3 {
	
	static char[] startChar(char[] a, int start, int len) {
       
		if (start < 0 || len < 0 || start + len > a.length) {
            return null;
        }

        char[] result = new char[len];
        int j=0;
        for(int i=start;i< start + len ;i++) {
    	    result[j] = a[i];
    	    j++;
        }
        return result;
    }
	
	public static void main(String args[]) {
		
		char[] a = startChar(new char[] {'a','b','c'}, 0, 4);
		if (a != null) {
            System.out.println(Arrays.toString(a));
        } else {
            System.out.println("null");
        }
		
		char[] b = startChar(new char[] {'a','b','c'}, 0, 3);
		if (b != null) {
            System.out.println(Arrays.toString(b));
        } else {
            System.out.println("null");
        }
		
		char[] c = startChar(new char[] {'a','b','c'}, 0, 2);
		if (c != null) {
            System.out.println(Arrays.toString(c));
        } else {
            System.out.println("null");
        }
		
		char[] d = startChar(new char[] {'a','b','c'}, 0, 1);
		if (d != null) {
            System.out.println(Arrays.toString(d));
        } else {
            System.out.println("null");
        }
		
		char[] e = startChar(new char[] {'a','b','c'}, 1, 3);
		if (e != null) {
            System.out.println(Arrays.toString(e));
        } else {
            System.out.println("null");
        }
		
		char[] f = startChar(new char[] {'a','b','c'}, 1, 2);
		if (f != null) {
            System.out.println(Arrays.toString(f));
        } else {
            System.out.println("null");
        }
		
		char[] g = startChar(new char[] {'a','b','c'}, 1, 1);
		if (g != null) {
            System.out.println(Arrays.toString(g));
        } else {
            System.out.println("null");
        }
		
		char[] h = startChar(new char[] {'a','b','c'}, 2, 2);
		if (h != null) {
            System.out.println(Arrays.toString(h));
        } else {
            System.out.println("null");
        }
		
		char[] k = startChar(new char[] {'a','b','c'}, 2, 1);
		if (k != null) {
            System.out.println(Arrays.toString(k));
        } else {
            System.out.println("null");
        }
		
		char[] l = startChar(new char[] {'a','b','c'}, 3, 1);
		if (l != null) {
            System.out.println(Arrays.toString(l));
        } else {
            System.out.println("null");
        }
		
		char[] m = startChar(new char[] {'a','b','c'}, 1, 0);
		if (m != null) {
            System.out.println(Arrays.toString(m));
        } else {
            System.out.println("null");
        }
		
		char[] n = startChar(new char[] {'a','b','c'}, -1, 2);
		if (n != null) {
            System.out.println(Arrays.toString(n));
        } else {
            System.out.println("null");
        }
		
		char[] p = startChar(new char[] {'a','b','c'}, -1, -2);
		if (p != null) {
            System.out.println(Arrays.toString(p));
        } else {
            System.out.println("null");
        }
		
		char[] q = startChar(new char[] {},0, 1);
		if (q != null) {
            System.out.println(Arrays.toString(q));
        } else {
            System.out.println("null");
        }
	}

}
