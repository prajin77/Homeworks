class Savings
{
    public static void main (String [] args )
    {
        int deposit =50000;
        int intrest =6;
        int year =5;
        int y = deposit*intrest*year ;
        int total = y/100;
        int amount = total+deposit;
        System.out.println("The Deposit amount is "+deposit);
        System.out.println("The Simple intrest is "+total);
        System.out.println("The Total amount is "+amount);
        
        
    }
}