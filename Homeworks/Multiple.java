import java.util.Scanner;
class Multiple 
{
	public static void main (String [] args )
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if 	((num%3==0)&&(num%7==0))
		{
			System.out.println("The Number is Divisible by 3 and 7");
			
		}
		else if (num%7==0)
			{
				System.out.println("The Number is Divisible by 7");
				
			}
			else if (num%3==0)
			{
				System.out.println("The Number is Divisible by 3");
				
			}
			else 
			{
				System.out.println("The Number is not Divisible by 3 and 7 ");
				
			}
				
				
			
			
			
		
		
		
		
		
	}
} 