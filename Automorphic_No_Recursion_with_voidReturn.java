import java.util.*;
public class Automorphic_No_Recursion_with_voidReturn{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();

		temp = n;
		checkAuto(n, n*n);
	}

	public static void checkAuto(n, square){
		if(n == 0){
			System.out.print(n+ "Automorphic Number");
		}
		if(n%10 != square %10){
			System.out.print(n+ "Not Automorphic Number");
		}

	checkAuto(n/10, square/10);
	}
}