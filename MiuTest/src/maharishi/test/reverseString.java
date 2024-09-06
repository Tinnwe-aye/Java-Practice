package maharishi.test;

public class reverseString {
	public static void main(String args[]) {
		String s = "Hello";
		String res = "";
		for(int i = 0; i < s.length(); i++) {
			res =s.charAt(i) + res;
		}
		System.out.println(res);
	}
}
