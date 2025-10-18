//Write a program to find the greatest common divisor (GCD) of two numbers using recursion.

import java.util.*;
public class Find_GCD_2_No_FR
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter the Number 2: ");
		int num2 = sc.nextInt();

		int result = gcd(num1, num2);
		System.out.println("GCD of " + num1 + " & " + num2 + " is: " + result);
	}

	static int gcd(int no1, int no2)
	{
		if(no2 == 0)
			return no1;

		return gcd(no2, no1 % no2);
	}
}