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
		int [] [] x = new int [5][4];
		for (int i=0; i<x.length; i++) {
			for(int o=0; o<x[0].length; o++) {
				x[i][o] = o+i;
			}
		}
		System.out.println("The integer 2D array has 5 rows and 4 columns.");
		System.out.println("The 2D array is the following:");
		for (int i=0; i<x.length; i++) {
			for(int o=0; o<x[0].length; o++) {
				System.out.print(x[i][o] + " ");
			}
			System.out.println();
		}
	}
}
