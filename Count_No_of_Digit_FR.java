//Write a program to count the number of digits in a given number using recursion.


import java.util.*;
public class Count_No_of_Digit_FR
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int result = Count(no);
		System.out.println("Print the Count of Digit: " + result);
	}
	
	static int Count(int no)
	{
		if(no == 0)
			return 0;

		return 1 + Count(no/=10);
	}
}