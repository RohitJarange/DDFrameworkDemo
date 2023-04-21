package practice;

public class fabonacciSeries
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 1;
		int n = 20;
		
		for (int i = 1; i <= n; i++)
		{
			System.out.print(num1 + " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}
}
