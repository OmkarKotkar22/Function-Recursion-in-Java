/*Print odd numbers from 2 to 20*/

import java.util.*;
public class recursionOdd1_n{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no =sc.nextInt();
		System.out.println("Enter the Limit: ");
		int limit = sc.nextInt();
		getSeries(no, limit);
	}

	public static void getSeries(int no, int limit){
		if(no > limit){
			return;
		}
	
		System.out.print(no + " ");

		getSeries(no+2, limit);
	}
}