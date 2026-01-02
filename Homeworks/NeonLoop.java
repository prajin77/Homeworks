class NeonLoop 
{
	public static void main (String[] args)
	{
		int a = 9;
		int temp = a*a;
		int sum = 0;
		int rem = 0;
		while (temp>0)
		{
		  rem  = temp%10;   
		  sum = sum + rem;
		  temp = temp/10; 
		}
		if (sum==a)
		{
			System.out.println("It is a Neon Number  ");
			
		}
		else 
		{
			System.out.println("Not a Neon Number  ");
		}
	
	}
}