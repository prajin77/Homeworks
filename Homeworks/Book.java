import java.util.Scanner;

class Book
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String a[] = new String[100]; // Book names
        String b[] = new String[100]; // Book IDs

        int index = 0;
        int num;

        do
        {
            System.out.println("\nEnter the Choice");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Exit");

            num = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch(num)
            {
                case 1:
                    System.out.println("Enter the Book Name:");
                    a[index] = sc.nextLine();

                    System.out.println("Enter the Book ID:");
                    b[index] = sc.nextLine();

                    index++;
                    
                    break;

                case 2:
                    if(index == 0)
                    {
                        System.out.println("No books available.");
                    }
                    else
                    {
                        System.out.println("---- Book List ----");
                        for(int i = 0; i < index; i++)
                        {
                            System.out.println("Name: " + a[i] + " | ID: " + b[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the Book ID to search:");
                    String o = sc.nextLine();

                   

                    for(int i = 0; i < index; i++)
                    {
                        if(o.equals(b[i]))
                        {
                            System.out.println("Book Found!");
                            System.out.println("Book Name: " + a[i]);
                            System.out.println("Book ID: " + b[i]);
                            
                            
                        }
						 else 
                           {
                             System.out.println("Invalid ID!");
						   }
							 
                    }
               
						
						
						
						
				


                case 4:
                    System.out.println("Exiting program");
                    break;

               
            }

        } while(num != 4);
    }
}
