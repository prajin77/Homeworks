import java.util.Scanner;

class ATM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double balance = 1000.75;   // double balance

        System.out.print("Enter withdraw amount: ");
        float withdraw = sc.nextFloat();   // float input

        // ✅ Convert properly (rounding instead of truncating)
        int processAmount = Math.round(withdraw);

        double finalWithdraw = (double) processAmount; // back to double

        balance = balance - finalWithdraw;

        System.out.println("Processed Amount (int) = " + processAmount);
        System.out.println("Final Balance = " + balance);
    }
}
