package practice;

public class demo1 
{
	public static void main(String[] args)
	{
		int num = 987 , rev = 0;
		
		while (num !=0)
		{
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
	}
}
