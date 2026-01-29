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
		int ran = (int)(Math.random() * (200 - 51 + 1)) + 51;
		int [] x = new int [ran];
		int len = x.length;
		for (int i = 0; i < len; i++) {
			x[i] = (int)(Math.random() * 100) + 1;
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		//max
		for (int in = 0; in < len; in++) {
			if (x[in] > max) {
				max = x[in];
			}
		}
		//min
		for (int ind = 0; ind < len; ind++) {
			if (x[ind] < min) {
				min = x[ind];
			}
		}
		//average
		int ad = 0;
		for (int inde = 0; inde < len; inde++) {
			ad = ad + x[inde];
		}
		int av = ad / len;
		
		System.out.println("The maximum amount is: " + max);
		System.out.println("-----------------------------------");
		System.out.println("The minimum amount is: " + min);
		System.out.println("-----------------------------------");
		System.out.println("The average of the array is: " + av);
		System.out.println("-----------------------------------");
	}
}
