class Armstrong
{
    public static void main (String [] args )
    {
        int a = 1634;
        int b= a%10;//5
        int c =a/10;//544
        int d = c%10;//4
        int e = c/10;//54
        int f = e%10;//4
        int g=e/10;//5
        int h=(b*b*b*b)+(d*d*d*d)+(f*f*f*f)+(g*g*g*g);
        boolean j = (h==a);
        System.out.println(j);
        
        
    }
}