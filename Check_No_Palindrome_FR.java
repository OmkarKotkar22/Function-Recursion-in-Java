//Write a program to check whether a given number is a palindrome using recursion.

import java.util.*;
public class Check_No_Palindrome_FR
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int temp = no;
		int result = palindrome(temp, 0);
		if(result == temp)
		{
			System.out.println("No is Palindrome");
		}	
		else
		{
			System.out.println("No is not Palindrome");
		}
	}
	
	static int palindrome(int no, int rev)
	{
		if(no == 0)
			return rev;

		int ld = no % 10;
		rev = rev * 10 + ld;
		no = no / 10;
		return palindrome(no, rev);
	}
}

