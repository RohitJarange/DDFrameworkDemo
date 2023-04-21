package javacoding;

import java.util.Iterator;
import java.util.Scanner;

public class palindrome11
{
	public static void main(String[] args) 
	{
		
		String org = "madam";
		String rev = "";
		
		for (int i = org.length()-1; i>=0; i--)
		{
			rev = rev + org.charAt(i);
		}
		System.out.println(rev);
		
		if (org.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
	
}
