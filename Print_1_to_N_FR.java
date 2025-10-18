//Write a program to print numbers from 1 to n using recursion.

import java.util.*;
public class Print_1_to_N_FR
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();

		print1toN(num);
	}

	static void print1toN(int no)
	{
		if(no == 0)
		 	return;

		print1toN(no-1);
		System.out.println("Number is: " + no);

	}
}