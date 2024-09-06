package maharishi.test;

public class CountChar{
	   public static int countChacter(String str,char ch){
	      int length = str.length()-1;
	      int count = 0;
		while(length >= 0){
		   if(ch == str.charAt(length)){
			 count++;
		   }	
		   length--;		
		}
		return count;	
	  }
	   public static void main(String args[]) {
			  int res = countChacter("lHello Worldl",'l');
			  System.out.println(res);
		  }
	}