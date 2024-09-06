package realTest;

public class isPrimeHappy {
	
static int isPrimeHappy(int n) 
{
	int total = 0;
	int isPrime = 0;
	int num = n;
	
	while(num > 1) 
	{
		for(int i=2;i<num;i++) 
		{
			if(num%i == 0) 
			{
				isPrime = 0;
				break;
			}else 
			{
				isPrime = 1;
			}
		}
		
		if(isPrime == 1) {
			if(num < n) total += num;
		}
		num--;
	}

	if(total == 0 ) return 0;
	
	return (total % n == 0) ? 1 : 0;
}
	
	public static void main(String args[]){
		System.out.println(isPrimeHappy(5));
		System.out.println(isPrimeHappy(25));
		System.out.println(isPrimeHappy(32));
		System.out.println(isPrimeHappy(8));
		System.out.println(isPrimeHappy(2));
	}

}
