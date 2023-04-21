package javapractice;

public class thisandsuper
{
	int a = 10;
	
	public void m1()
	{
		int b = 20;
		System.out.println(b);
		System.out.println(this.a);
		
	}
	
	public static void main(String[] args)
	{
		thisandsuper s = new thisandsuper();
		s.m1();
	}
}
