import java.util.Scanner;
class Grade 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Grade : ");
		char ch = sc.next().charAt(0);
		
		switch (ch)
		{
			case 'a' : 
			System.out.println("Very Good");
			break;
			case 'b' : 
			System.out.println("Good");
			break;
			case 'c' : 
			System.out.println("Moderate");
			break;
			case 'd' : 
			System.out.println("Just pass");
			break;
			case 'f' : 
			System.out.println("Fail");
			break;
			case 'A' : 
			System.out.println("Very Good");
			break;
			case 'B' : 
			System.out.println("Good");
			break;
			case 'C' : 
			System.out.println("Moderate");
			break;
			case 'D' : 
			System.out.println("Just pass");
			break;
			case 'F' : 
			System.out.println("Fail");
			break;
			default :
			System.out.println("Invalid Grade");
			break;
		}
	}
}
			
			
			
			
		
		
