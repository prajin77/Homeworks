import java.util.Scanner;

class Arrayrev
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        // Input
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Print Original Array
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        // Print Reverse Array
        System.out.print("\nReversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
