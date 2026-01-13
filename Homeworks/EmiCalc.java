import java.util.Scanner;
class EmiCalc 
{
long principal()
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter The Principle Amount : ");
	long  pa =sc.nextLong();
	return pa;
}
float rate ()
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter The Rate of Intrest : ");
	float ri =sc.nextFloat();
	return ri;
}
int time ()
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter The months : ");
	int tm =sc.nextInt();
	return tm;
}
public static void main(String[] args )
{
	EmiCalc obj = new EmiCalc();
	long p = obj.principal();
	float r = obj.rate();
	int t = obj.time();
	float v = r/(12*100);
	
	double emi = (p*v*Math.pow(1+v,t))/(Math.pow(1+v,t)-1);
	int g = (int)emi;
	System.out.println("EMI :"+g);
	

	
}

	

}