package javapractice;

public class demothis2 extends demothis1
{
	int b = 52;
	
	public void m1()
	{
		int c = 32;
		System.out.println(c);
		System.out.println(this.b);
		System.out.println(super.a);
	}
	
	public static void main(String[] args)
	{
		demothis2 s = new demothis2();
		s.m1();
	}
}
