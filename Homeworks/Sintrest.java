class Sintrest
{
    public static void main (String [] args )
    {
        int deposit =25000;
        int intrest =7;
        int year =4;
        int y = deposit*intrest*year ;
        int total = y/100;
        int amount = total+deposit;
        System.out.println("The Deposit amount is "+deposit);
        System.out.println("The Simple intrest is "+total);
        System.out.println("The Total amount is "+amount);
        
        
    }
}