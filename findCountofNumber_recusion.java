/*Count number of digits in a number

Example: 98765 → 5*/

import java.util.*;
public class findCountofNumber_recusion{
	public static void main(String x[]){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		System.out.println("Enter the count: ");
		int count= sc.nextInt();

		int result = getSeries(no, count);
		System.out.print(result);
	}

	public static int getSeries(int no, int count){
		if(no <= 0){
			return count;
		}
 
		return getSeries(no/10, count+1);
	}
}