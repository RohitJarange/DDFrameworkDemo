package practice;

public class pallindrome
{
	public static void main(String[] args)
	{
		String org = "MadaM";
		String rev = "";
		
		for (int i = org.length()-1; i>=0; i--)
		{
			rev = rev + org.charAt(i);
		}
		System.out.println(org);
		
		if (org.equals(rev))
		{
			System.out.println("is Pallindrome");
		}
		else 
		{
			System.out.println("is not pallindrome");
		}
	}
}
