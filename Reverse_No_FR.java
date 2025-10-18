//Write a program to reverse a given number using recursion.

import java.util.*;
public class Reverse_No_FR
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int result = Reverse(no, 0);
		System.out.println("Reverse Number: "+ result);
	}

	static int Reverse(int no, int rev)
	{
		if(no == 0)
			return rev;

		int ld = no % 10;
		rev = rev * 10 + ld;
		return Reverse(no / 10, rev);
	}
}