class Logicaloperator 
{
    public static void main (String [] args )
    {
        int mark = 85;
        boolean attendence = true;
        boolean disciplne = true;
        boolean answer =(attendence)&&(disciplne)|| (mark >= 90) ;
        
        System.out.println ("Pass & Eligibility For Scholarship : " +answer);
    }
} 
    