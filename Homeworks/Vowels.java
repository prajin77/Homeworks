import java.util.Scanner;
class vowels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the letter : ");
        char ch = sc.next().charAt(0);
        if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
        {
            System.out.println("The letter is a vowel");
        
        }
        else if ((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
        {
            System.out.println("The letter is a vowel");
        
        }
        else 
        {
            System.out.println("The letter is a consonent ");
        }
    }
}