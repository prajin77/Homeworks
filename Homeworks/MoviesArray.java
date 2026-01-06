import java.util.Scanner;
class MoviesArray  {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Numer of Rows :");
		int rows = sc.nextInt(); 
		System.out.print("Enter the Numer of Columns :");
		int col = sc.nextInt();
		String a[][] =new String [rows][col];
		
		for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print("Enter the Movie name to be Stored in "+i+","+j+ "Index :" );
				a[i][j]= sc.next();
            }
           
        }
		 for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
				
				
            }
              System.out.println("");
        }
        
        
    }
}