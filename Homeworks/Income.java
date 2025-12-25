import java.util.Scanner ;

class Income
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Age : ");
       
        int age =sc.nextInt();
        System.out.println("Enter Monthly Income  : ");
        int income =sc.nextInt();
        if (age>=21)
        {
            System.out.println("Your Age is qualified to apply loan ");
            
        }
        else 
         System.out.println("Your Age is not qualified to apply loan ");
        if (income>=25000)
        {
            System.out.println("Your Income is qualified  to apply loan ");
            
        }
        else 
         System.out.println("Your Income is not qualified to apply loan ");
        
        
    }
}