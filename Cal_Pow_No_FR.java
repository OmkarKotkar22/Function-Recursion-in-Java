//Write a program to calculate the power of a number (x^n) using recursion.


import java.util.*;

public class Cal_Pow_No_FR
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base: ");
		int base = sc.nextInt();

		System.out.println("Enter the Index: ");
		int index = sc.nextInt();

		int result = pow(base, index);
		System.out.println("Base " + base + " & Index " + index + " the result is: " + result);
	}

	static int pow(int base, int index)
	{
		if( index == 0)
			return 1;
		return base * pow(base, index-1);
	}
}