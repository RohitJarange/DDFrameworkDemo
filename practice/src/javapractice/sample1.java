package javapractice;

public class sample1 
{
	int num1;
	int num2;
	
	public sample1(int a ,int b) 
	{
		num1 = a;
		num2 = b;
	}
	
	public void add()
	{
		int sum = num1 + num2;
		System.out.println(sum);
		
	}
	
	public static void main(String[] args)
	{
		sample1 s = new sample1(5, 6);
		s.add();
	}
}
