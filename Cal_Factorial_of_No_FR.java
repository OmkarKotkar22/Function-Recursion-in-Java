//Write a program to calculate the factorial of a given number using recursion. 

import java.util.*;
public class Cal_Factorial_of_No_FR
{
	public static int fact(int no)
	{
		if(no == 0 || no == 1)
		{
			return 1;
		}
		return no * fact(no-1);
	}
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int result = fact(no);
		System.out.println("Factorial of " +no+ " is " + result);
	}
}
