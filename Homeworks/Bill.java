import java.util.Scanner;
class Bill 
{
	public static void main (String [] args )
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Unit  : ");
		int num = sc.nextInt();
		if (num<=100) 
		{
			System.out.println("The Bill is :" +5*num);
			
		}
		else if ((num>=101)&&(num<200))
			{
				System.out.println("The Bill is :"+5*num);
				
			}
		else if ((num>200))
			{
				System.out.println("The Bill is :"+5*num);
				
			}
		else 
			{
				System.out.println("The unit is invalid ");
				
			}
				
				
			
			
			
		
		
		
		
		
	}
} 