//Write a program to find the sum of even numbers up to n using recursion.

import java.util.*;
public class Cal_Sum_of_Even_No_FR
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int result = sumEven(no, 0);
		System.out.println("Sum of Even Number: " + result);
	}

	static int sumEven(int no, int sum)
	{
		if(no == 0)
			return sum;

		sum = sum + (no % 2 == 0);
		return sum + sumEven(no, sum);
	}
}