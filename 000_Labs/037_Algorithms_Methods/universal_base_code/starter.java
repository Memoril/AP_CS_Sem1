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
		int ran = (int)(Math.random()* 100) + 1;
		int [] x = new int [ran];
		int len = x.length;
		for (int i = 0; i < len; i++) {
			x[i] = (int)(Math.random() * 100) + 1;
		}
		toStringArray(x);
		System.out.println("-----------------------------------");
		System.out.println("The maximum amount is: " + getArrayMax(x));
		System.out.println("-----------------------------------");
		System.out.println("The minimum amount is: " + getArrayMin(x));
		System.out.println("-----------------------------------");
		System.out.println("The average of the array is: " + getArrayAverage(x));
		System.out.println("-----------------------------------");
	}
	
	public static void toStringArray(int [] a) {
		for (int count = 0; a.length > count; count++) {
			System.out.println(a[count]);
		}
	}
	public static int getArrayAverage(int [] a) {
		//average
		int ad = 0;
		for (int inde = 0; inde < a.length; inde++) {
			ad = ad + a[inde];
		}
		int av = ad / a.length;
		return av;
	}
	public static int getArrayMax(int [] a) {
		//max
		int max = Integer.MIN_VALUE;
		for (int in = 0; in < a.length; in++) {
			if (a[in] > max) {
				max = a[in];
			}
		}
		return max;
	}
	public static int getArrayMin(int [] a) {
		//min
		int min = Integer.MAX_VALUE;
		for (int ind = 0; ind < a.length; ind++) {
			if (a[ind] < min) {
				min = a[ind];
			}
		}
		return min;
	}
}
