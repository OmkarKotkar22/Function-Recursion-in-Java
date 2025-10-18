//Write a program to print numbers from n down to 1 using recursion.

import java.util.*;
public class Print_N_to_1_FR
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();

		printNto1(num);
		//int result = printNto1(num);
		//System.out.println("Print the " + num + " is: " + result);
	}

	static void printNto1(int no)
	{
		if(no == 0)
		 	return;

		System.out.println("Number is: " + no);
		printNto1(no-1);
	}
}