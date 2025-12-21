class Assignmentoperator 
{
    public static void main (String [] args)
    {
        int a = 5;
        int initial = a;
        int c = a++;
        int d = ++a;
        int e = --a;
        int f = a--;
        
        System.out.println("INITIAL VALUE :"+initial);
        System.out.println("AFTER A++ :"+c);  
        System.out.println("AFTER ++A :"+d);  
        System.out.println("AFTER A-- :"+f);  
        System.out.println("AFTER --A :"+e);  
        
        }
}