//Write a program to calculate the sum of digits of a given number using recursion.

import java.util.*;
public class Cal_Sum_of_Digit_FR
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int result = sum(no, 0);
		System.out.println("Sum of " + no + " is: " + result);
	}

	static int sum(int no, int sum)
	{
		if(no == 0)
			return sum;

		int ld = no%10;
		sum = sum+ld;
		return sum(no/=10, sum);
	}
}