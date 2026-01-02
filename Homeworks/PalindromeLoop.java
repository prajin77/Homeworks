class PalindromeLoop 
{
	public static void main (String[] args)
	{
		int a = 123;
		int temp = a;
		int sum = 0;
		int rem = 0;
		while (temp>0)
		{
		  rem  = temp%10;   //2
		  sum = sum *10 + rem ;//10
		  temp = temp/10; //10
		}
		if (sum==a)
		{
			System.out.println("It is a Palindrome ");
			
		}
		else 
		{
			System.out.println("Not a Palindrome ");
		}
	
	}
}