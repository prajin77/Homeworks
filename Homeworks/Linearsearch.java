import java.util.Scanner;
class Linearsearch
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner (System.in); 
		System .out.println("Enter the Length of Array : ");
		int length = sc.nextInt();
		int arr[] = new int [length];
		int index = 0;
		
		for (int i =0;i<arr.length;i++)
		{
			System .out.println("Enter the Element ( Must be in Ascending !): ");
			arr[index]=sc.nextInt();
			index++;
		}
		System .out.println("The Array is :");
		for (int i =0;i<arr.length;i++)
		{
			System .out.print(" "+arr[i]);
		}
		System .out.println(" ");
		System .out.println("Enter the value to be Searched  : ");
		int searchValue = sc.nextInt();
		Linearsearch obj = new Linearsearch();
		int result =obj.linear(arr,searchValue);
	    System .out.println(result );
	}
	public int linear(int arr[],int searchValue )
	{
		for (int i = 0;i<arr.length;i++)
		{
			if (searchValue == arr[i])
			{
				return i;
			}
			
		}
		return -1;
	}


}