package MiuArabic;

public class reverseString {
	
	public static void main(String args[]) {
		String str = "Hello";
		String reverseStr = "";
		
		for(int i=0;i<str.length();i++) {
			reverseStr = str.charAt(i)+reverseStr;
		}
		
		System.out.println(reverseStr);
	}

}
