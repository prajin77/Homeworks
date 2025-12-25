class student {
    public static void main(String [] args)
    {
        int mark = 75;
        if((mark>=90) && (mark<=100))
        {
            System.out.println("A Grade");
        }
        else if((mark>=70) && (mark<90))
        {
            System.out.println("B Grade");
        }
         else if((mark>=50) && (mark<70))
        {
            System.out.println("C Grade");
        }
         else if((mark>=25) && (mark<50))
        {
            System.out.println("D Grade");
        }
         else if((mark<25) && (mark==0))
        {
            System.out.println("FAIL");
        }
        else 
          System.out.println(" Invalid Mark ");
        
    }
}