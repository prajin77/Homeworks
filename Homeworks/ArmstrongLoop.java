class ArmstrongLoop 
{
	public static void main (String[] args)
	{
		int a = 153;
		int temp = a;
		int sum = 0;
		int rem = 0;
		while (temp>0)
		{
		  rem  = temp%10;   //3
		  sum = sum + (rem*rem*rem);
		  temp = temp/10; //15
		}
		if (sum==a)
		{
			System.out.println("It is a Armstrong Number ");
			
		}
		else 
		{
			System.out.println("Not a Armstrong Number");
		}
	
	}
}