/*Print numbers from 10 to 1*/

import java.util.*;
public class recursion10_1{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no =sc.nextInt();
		System.out.println("Enter the Limit: ");
		int limit = sc.nextInt();
		getSeries(no, limit);
	}

	public static void getSeries(int no, int limit){
		if(limit > 10){
			return;
		}

		System.out.print(no + " ");
		no = no - 1;
		getSeries(no, limit + 1);
	}
}