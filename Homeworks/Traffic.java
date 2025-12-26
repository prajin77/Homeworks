import java.util.Scanner;
class Traffic 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Colour of Traffic Signal : ");
		String ch = sc.nextLine();
		
		switch (ch)
		{
			case "Red" : 
			System.out.println(" Stop ");
			break;
			case "red" : 
			System.out.println(" Stop ");
			break;
			case "Orange" : 
			System.out.println(" Get Ready ");
			break;
			
			case "orange" : 
			System.out.println("Get Ready ");
			break;
			case "Green" : 
			System.out.println(" Go ");
			break;
			case "green" : 
			System.out.println(" Go ");
			break;
		
			
			default :
			System.out.println("Invalid Colour");
			break;
		}
	}
}
			
			
			
			
		
		
