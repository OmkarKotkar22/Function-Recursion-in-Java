//Write a program to find the sum of first n natural numbers using recursion.

import java.util.*;
public class Sum_N_Natural_No_FR
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int result = sum(no);
		System.out.println("Sum of" + no + "Natural Number: " + result);
	}

	static int sum(int no)
	{
		if(no == 1)
			return 1;

		return no + sum (no - 1);	
	}
}