/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word.");
		String inp = sc.nextLine();
		System.out.println("Letter by letter:");
		String[] x = new String[inp.length()];
		for (int i=0; (i<inp.length()); i++) {
			x[i] = inp.substring(i, i+1);
		}
		for (int i=0; (i<inp.length()); i++) {
			System.out.println(i + " " + x[i]);
		}
	}
}
