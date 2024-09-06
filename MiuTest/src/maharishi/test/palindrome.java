package maharishi.test;

public class palindrome {
	
	public static void main(String args[]) {
		System.out.println(palin("A man, a plan, a canal: Panama"));
	}
	
	static boolean palin(String s) {
		String  str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        int left = 0;
        int right = str.length()-1;
        while(left < right){
        	System.out.println(left+"/"+right);
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
	}
}
