/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		int [] ar1 = new int [10];
		int x = 0;
		int y = ar1.length - 1;
		while (x < ar1.length) {
			ar1 [x] = y;
			System.out.println(ar1[x]);
			x++;
			y--;
		}
	}
}
