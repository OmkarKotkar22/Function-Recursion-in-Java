//Write a program to find the product of digits of a given number using recursion.

import java.util.*;
public class Cal_Prod_of_Digit_FR
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int result = Prod(no, 1);
		System.out.println("Display the Product of Digit: "+ result);
	}

	static int Prod(int no, int prod)
	{
		if(no == 0)
			return prod;

		int ld = no % 10;
		prod = prod * ld;
		return Prod(no/=10, prod); 
	}
}