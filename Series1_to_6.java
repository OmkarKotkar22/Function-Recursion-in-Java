/* 1 2 2 4 3 6 4 8 5 10 6 12*/

import java.util.*;
public class Series1_to_6{

	public static void print_Series(int n){
		if(n > 6) return;

		System.out.print(n + " " + (n * 2) + " ");
		print_Series(n+1);
	}

	public static void main(String x[]){
		print_Series(1);
	}
}