import java.util.*;
public class Number_Sq_Series{
	public static void sq_series(int n){
		if(n > 10) return;

		System.out.print((n*n) + " ");
		sq_series(n+1);
	}

	public static void main(String x[]){
		sq_series(1);
	}
}