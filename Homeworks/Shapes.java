import java.util.Scanner;
class Shapes 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Shape : ");
		
		String ch = sc.nextLine();
		
		switch (ch)
		{
			case "Circle" : { 
			System.out.println(" Radius :");
			int a = sc.nextInt();
			double b = a*a*3.14;
			System.out.println(" Area of Circle Is :"+b);
			break; }
			case "circle" : { 
			System.out.println(" Radius :");
			int c = sc.nextInt();
			double  d = c*c*3.14;
			System.out.println(" Area of Circle Is :"+d);
			break; }
			case "Rectangle" : {
			System.out.println(" Enter the length: ");
			System.out.println(" Enter the breadth ");
			int e = sc.nextInt();
			int f = sc.nextInt();
			int g = e*f;
			System.out.println(" Area of Rectangle :"+g);
			break;}
			case "rectangle" : {
			System.out.println(" Enter the length: ");
			System.out.println(" Enter the breadth ");
			int h = sc.nextInt();
			int i = sc.nextInt();
			int j = h*i;
			System.out.println(" Area of Rectangle :"+j);
			break;}
			case "Square" : {
			System.out.println(" Enter Sides :");
			int k = sc.nextInt();
			int l = k*k;
			System.out.println("Area of Square :"+l);
			break;}
			case "square" : {
			System.out.println(" Enter Sides :");
			int n = sc.nextInt();
			int m = n*n;
			System.out.println("Area of Square :"+m);
			break;}
			case "Triangle" : {
			System.out.println("Enter Base :");
			System.out.println("Enter Height :");
			int o = sc.nextInt();
			int p = sc.nextInt();
			double  q =0.5*o*p;
			System.out.println("Area of Triangle :" +q);
			break;}
			case "triangle" : {
			System.out.println("Enter Base :");
			System.out.println("Enter Height :");
			int r = sc.nextInt();
			int s = sc.nextInt();
			double t =0.5*r*s;
			System.out.println("Area of Triangle :" +t);
			break;}
		
			default :
			System.out.println("Invalid Shape ");
			break;
		}
	}
}
			
			
			
			
		
		
