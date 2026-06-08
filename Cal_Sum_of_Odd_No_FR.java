//Write a program to find the sum of even numbers up to n using recursion.

import java.util.*;
public class Cal_Sum_of_Odd_No_FR
{
	static int sumOdd;
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		 sumOdd(no);
        System.out.print(sumOdd + " : Sum of Odd Number");

	}

	public static void sumOdd(int no)
	{
		if(no == 0)
			return;

		int r = no % 10;
		if(r % 2 != 0){
			sumOdd += r;
		}
		sumOdd(no/10);
	}
}