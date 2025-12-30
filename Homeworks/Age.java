import java.util.Scanner ;
class age
{
    public static void main (String [] args )
    {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter your age : ");
    int age = sc.nextInt();
    if (age<13)
     System.out.println("Child");
    else if ((age>=13)&&(age<19))
     System.out.println("teenager");
    else if ((age>=20)&&(age<59))
     System.out.println("Adult");
     if (age>=60)
     System.out.println("Senior Citizen");
    }
}