import java.util.Scanner;
class Binarysearcha
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
			int left = 0;
			int right = arr.length-1;
			int mid = (left+right)/2;
			System .out.println("Enter the value to be Searched  : ");
			int searchValue = sc.nextInt();
			Binarysearcha obj = new Binarysearcha ();
			int result =obj.binary(arr,searchValue);
		
			System .out.println(result );
	
	}
	public int binary(int arr[],int searchValue)
	{
			int left = 0;
			int right = arr.length-1;
			int mid = (left+right)/2;
			while (left<=right)
			{
			
				if (searchValue == arr[mid] )
				{
					return mid ;
				}
				else if (searchValue < arr[mid])
				{
					right  = mid - 1;
				}
				else if (searchValue > arr[mid])
				{
					left  = mid + 1;
				}
				mid = (left+right)/2;
			}
		
		
			return -1;
	}		

		
}