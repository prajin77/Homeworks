import java.util.Scanner;
class Emp
{
	public static void main (String[] args )
	{
		Scanner sc = new Scanner (System.in);
		Scanner sc1 = new Scanner (System.in);
		System.out.println("Enter the number of Employee : ");
		int n = sc.nextInt();
		String a[] = new String [n];
		int index =0;
		int num;
		do
		{
			System.out.println("Enter the Choice");
			System.out.println("Enter 1 to add Name  ");
			System.out.println("Enter 2 to View the list");
			System.out.println("Enter 3 to Exit  ");
			 num = sc.nextInt();
			switch (num)
			{
				case 1 :
				    System.out.println("Enter the Employee Name :");
					 a[index] = sc1.nextLine();
					 index++;
					 break;
				case 2 :
				 for (int i = 0;i<a.length;i++)
					{
						System.out.print(a[i]+" ");
					}
					break;
				case 3 :
				 break;
		    } 
		}while (num<3);
		
		
	}
}