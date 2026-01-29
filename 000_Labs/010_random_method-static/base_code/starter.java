/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int b = (int) (Math.random() * (9 - 0) + 0); 
		int y = (int) (Math.random() * (10 - 1) + 1);
		double z = (Math.random() * (3.5 - 2.5) + 2.5);
		double a = (Math.random() * (589 - 14)  + 14);
		
		System.out.println("A number between 0 - 9: " + b);
		System.out.println("A number between 1 - 10: " + y);
		System.out.println("A number between 2.5 - 3.5: " + z);
		System.out.println("A number between 14 and 589: " + a);
	}
}
