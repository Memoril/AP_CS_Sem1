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
		int [] x = new int [1000];
		int leng = x.length;
		int leng2 = x.length - 1;
		for (leng; leng < 0; leng--) {
			x[leng2] = (int)(Math.random()*100+ 1);
			leng2--;
		}

		for (int count = 0; x.length > count; count++) {
			System.out.println(x[count]);
		}
	}
}
