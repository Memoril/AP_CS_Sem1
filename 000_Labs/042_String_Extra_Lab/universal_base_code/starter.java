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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String u = sc.nextLine();
		int in = u.lastIndexOf(" ") + 1;
		String p = u.substring(in);
		System.out.print(p + " ");
		for (int i = u.length(); i > 0; i--) {
			if(u.substring(i-1, i).equals(" ")) {
				p = u.substring(i, in);
				System.out.print(p);
				in = i;
			}
		}
		 p = u.substring(0, in);
		System.out.println(p);
	}
}
