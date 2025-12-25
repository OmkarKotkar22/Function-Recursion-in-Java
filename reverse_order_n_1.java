/*Print digits in reverse order

Example: 1234 → 4 3 2 1*/

import java.util.*;
public class reverse_order_n_1{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		System.out.println("Enter the limit: ");
		int limit = sc.nextInt();

		getSeries(no , limit);
	}

	public static void getSeries(int no, int limit){
		if(no > limit || no <= 0){
			return;
		}

		System.out.print(no +" ");
		getSeries(no-1, limit);
	}
}