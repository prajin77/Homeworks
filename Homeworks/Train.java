import java.util.Scanner;
class Train
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Seat Type  : ");
		int ch = sc.nextInt();
		
		switch (ch)
		{
			case 1 : { 
			System.out.println(" General  ");
			System.out.println(" Price 250  ");
			break; }
			case 2 : {
			System.out.println(" Sleeper ");
			System.out.println(" Price 1000 ");
			break;}
			case 3 : {
			System.out.println(" AC 3 Tier ");
			System.out.println("Price 1500");
			break;}
			case 4 : {
			System.out.println("AC 4 Tier  ");
			System.out.println("Price 1500 ");
			break;}
			case 5 : {
			System.out.println("First Class ");
			System.out.println("Price 2000 ");
			break;}
			default :
			System.out.println("Invalid Seat Type ");
			break;
		}
	}
}
			
			
			
			
		
		
