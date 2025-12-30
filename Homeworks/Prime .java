import java.util.Scanner;
class Prime 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number :" );
		int num = sc.nextInt();
		if ((num > 1) && (num % 2 != 0) && (num % 3 != 0))

		{
			System.out.println("The Number is Prime ");
			
		}
		else {
		    	System.out.println("The Number is Not Prime ");
		    
		}
		
			
		
		
	}
	
}
		