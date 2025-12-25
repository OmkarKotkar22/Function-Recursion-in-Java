/*Print even numbers from 2 to 20*/

import java.util.*;
public class recursionEven2_20{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no =sc.nextInt();
		getSeries(no);
	}

	public static void getSeries(int no){
		if(no > 20){
			return;
		}

		System.out.print(no + " ");	
		getSeries(no+2);
	}
}