import java.util.Scanner;

class Game
{
    Scanner sc = new Scanner(System.in);

    long principal()
    {
        System.out.println("Enter The Player Score : ");
        long pa = sc.nextLong();
        return pa;
    }

    double rate()
    {
        System.out.println("Enter The Time Taken : ");
        double ri = sc.nextDouble();
        return ri;
    }

    double rank(long score, double time)
    {
        System.out.println("Enter The Ranks: ");
        int tm = sc.nextInt();

        double result = tm / time;
        return result;
    }

    public static void main(String[] args)
    {
        Game obj = new Game();

        long h = obj.principal();
        double z = obj.rate();
        double w = obj.rank(h, z);
		// double in worng casting 
		// double star = (integer)w;
		// double in correct casting
		int star = (int)w;
		System.out.println("Score = " + h);
        System.out.println("Time = " + z);
        System.out.println("Rank Value = " + star);
		// this casting helps in the round off of the rank 
    }
}
