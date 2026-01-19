class  Swap 
{
	void change(int a,int b)
	{
		 a = 10;
		 b = 20;
	}
	public static void main(String [] args)
	{
		Swap sp = new  Swap();
		int a = 20;
		int b = 10;
		sp.change(a,b);
		
		System.out.println(a);
		System.out.println(b);
	}
}