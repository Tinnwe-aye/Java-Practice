package realTest;

public class isStepped {
	
static int isStepped(int[] a) 
{
	int count = 1;
	for(int i=0;i<a.length-1;i++) 
	{
		if(a[i] > a[i+1] ) return 0;
		
		if(a[i] == a[i+1]) 
		{
			count++;
		} 
		else 
		{
			if(count >= 3) 
			{
				count = 1;
			}
			else 
			{
				return 0;
			}
		}
	}
			
	return (count >= 3) ? 1 : 0;
}
	
	public static void main(String args[]){
		System.out.println(isStepped(new int[] {1, 1, 1, 5, 5, 5, 5, 8, 8, 8}));
		System.out.println(isStepped(new int[] {1, 1, 5, 5, 5, 5, 8, 8, 8}));
		System.out.println(isStepped(new int[] {5, 5, 5, 15}));
		System.out.println(isStepped(new int[] {3, 3, 3, 2, 2, 2, 5, 5, 5}));
		System.out.println(isStepped(new int[] {3, 3, 3, 2, 2, 2, 1, 1, 1}));
		System.out.println(isStepped(new int[] {1, 1, 1}));
		System.out.println(isStepped(new int[] {1, 1, 1, 1, 1, 1, 1}));
	}

}
