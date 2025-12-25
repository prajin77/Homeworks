import java.util.Scanner ;

class Citizen
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Age : ");
        int age =sc.nextInt();
        if (age>=60)
        {
            System.out.println("Senior Citizen");
            
        }
        else 
         System.out.println("Not a Senior Citizen ");
        
        
    }
}