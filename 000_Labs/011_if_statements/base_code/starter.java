/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your first integer: ");
		int one = sc.nextInt();
		System.out.println("Choose your second integer: ");
		int two = sc.nextInt();
		System.out.println("Your first variable is: " + one);
		System.out.println("Your second variable is: " + two);
		if (one == two) {
			System.out.println("");
			System.out.println("These are the same two numbers");
		}
		else {
			System.out.println("");
			System.out.println("These are two different numbers");
		}
	}
}
