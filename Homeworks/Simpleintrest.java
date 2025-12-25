class Simpleintrest
{
    public static void main (String [] args )
    {
        int deposit =10000;
        int intrest =5;
        int year =3;
        int y = deposit*intrest*year ;
        int total = y/100;
        int amount = total+deposit;
        System.out.println("The Deposit amount is "+deposit);
        System.out.println("The Simple intrest is "+total);
        System.out.println("The Total amount is "+amount);
        
        
    }
}