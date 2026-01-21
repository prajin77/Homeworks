import java.util.Scanner;
class Zoho
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int choice = 0;
		System.out.println("Enter total Employees : ");
		int totalemp = sc.nextInt();
		int index = 0;
		int arr[] = new int[totalemp];
		int newarr[] = new int [arr.length-1];

		do {
			System.out.println("***MENU***");
			System.out.println("Select the Options Below :");
			System.out.println("1.Add Employees ID");
			System.out.println("2.Remove Employees ID ");
			System.out.println("3.Display Employees ID ");
			System.out.println("4.Exit");
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			switch (choice)
			{
				case 1 :
				    System.out.println("Enter Employee ID : ");
					for (int i =0;i<arr.length;i++)
					{
					  arr[index] = sc.nextInt();
					  index++;
						
					}
					break;
				
				case 2 : 
				    System.out.println("Enter the Employee ID to be Deleted : ");
					int ed = sc.nextInt();
					Zoho zh = new Zoho();
					int value = zh.search(arr,ed);
					for (int i = 0;i<value;i++)
					{
						newarr[i] = arr[i];
					}
			        for (int i = value+1;i<arr.length;i++)
					{
						newarr[i-1] = arr[i];
					}
					for (int i = 0;i<arr.length;i++)
					{
						System.out.println(newarr[i]);
						
					}
					
					  
					 break;
					
				    
				case 3 :
				     for (int i =0;i<arr.length;i++)
					 {
						 System.out.println(arr[i]);
					 }
					 break;
				case 4 : 
				   	System.out.println("Exited...");
					break;
					
					
				default :
				     System.out.println("Invalid choice ! ");

				

				
			}
			
			
		}while(choice<=4);
	}
	public int search(int arr[],int ed)
	{
		for (int i = 0;i<arr.length;i++)
		{
			if (ed == arr[i])
			{
				return i;
			}
		}
		return -1 ;
	}

}