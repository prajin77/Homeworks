class Classroom
{
    public static void main (String [] args)
    {
        int totalstr = 50;
        int girls =50*40/100;
        int totalgirls = totalstr-girls;
        int boys = totalstr-totalgirls;
        System.out.println("TOTAL GIRLS :"+totalgirls);
        System.out.println("TOTAL BOYS :"+boys);
    }
}