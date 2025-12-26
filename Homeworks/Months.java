import java.util.Scanner;
class Months 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Months in Number : ");
		int ch = sc.nextInt();
		
		switch (ch)
		{
			case 1 : 
			System.out.println("30 Days are in January");
			break;
			case 2 : 
			System.out.println("29 Days are in Febrary");
			break;
			case 3 : 
			System.out.println("30 Days are in March");
			break;
			
			case 4 : 
			System.out.println("30 Days are in April");
			break;
			case 5 : 
			System.out.println("30 Days are in May");
			break;
			case 6 : 
			System.out.println("31 Days are in June");
			break;
			case 7 : 
			System.out.println("30 Days are in July");
			break;
			case 8 : 
			System.out.println("31 Days are in Augest");
			break;
			case 9 : 
			System.out.println("30 days are in September");
			break;
			case 10 : 
			System.out.println("30 Days are in October");
			break;
			case 11 : 
			System.out.println("30 Days are in November");
			break;
			case 12 : 
			System.out.println("31 Days are in December");
			break;
			
			default :
			System.out.println("Invalid Month");
			break;
		}
	}
}
			
			
			
			
		
		
