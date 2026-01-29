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
		int [] ar = new int[1000];
		int len = ar.length;
		int len2 = ar.length - 1;
		while (len > 0) {
			ar[len2] = (int)(Math.random()* 100 + 1);
			len--;
			len2--;
		}
		int count = 0;
		while (ar.length > count) {
			System.out.println(ar[count]);
			count++;
		}
	}
}
