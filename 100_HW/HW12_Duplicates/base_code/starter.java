/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
 
 Create a program to do the following:
1. Create an array of 20 elements.
     a. The elements should have random values between 1 and 10.
2. Find all duplicates of a random number. 
     a. Generate a random number between 1 and 10. This will be your target number
     b. Find all duplicate numbers of your target number. 
     c. Print out the index of where ALL duplicates are and print out the total number of duplicates.
3. Find if there are two consecutive numbers in a row
     a. Using the same array as above. 
     b. Find if two consecutive numbers in a row are the same. 
     c. Print their indexes and what number it was!
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] x = new int [20];
		int len = x.length;
		System.out.println("-------------------------------------");
		System.out.println("These are the 20 numbers");
		for (int i = 0; i < len; i++) {
			x[i] = (int)(Math.random() * 10) + 1;
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		int tn = (int)(Math.random() * 10) + 1;
		System.out.println("The random number to look for is " + tn);
		int tnc = 0;
		for (int i2 = 0; i2 < len; i2++) {
			if (x[i2] == tn) {
				System.out.println("Duplicate found at index " + i2);
				tnc++;
			}
		}
		System.out.println("Total number of duplicates for " + tn + " is " + tnc);
		System.out.println("-------------------------------------");
		System.out.println("Looking for two in a row:");
		for (int i3 = 0; i3 < len - 1; i3++) {
			int ic = i3 + 1;
			if (x[i3] == x[ic]) {
				System.out.println("Two in a row found at indexes " + i3 + " and " + ic + ". The number is " + x[i3]);
			}
		}
	}
}
