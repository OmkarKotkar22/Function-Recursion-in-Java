/*2 729 4 512 6 343 8 216 10 125 12 64 14 27 16 8 18 1*/

import java.util.*;
public class Sq_Cube_Series{
	public static void sq_cube(int sq, int cube){
		if(sq > 18){
			return;
		}

		System.out.print(sq + " " + (cube*cube*cube) + " ");
		sq_cube(sq+2, cube-1);
	}

	public static void main(String x[]){
		sq_cube(2, 9);
	}
}