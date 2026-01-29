/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your first number: ");
		int one = sc.nextInt();
		System.out.println("");
		System.out.println("Please input your second number: ");
		int two = sc.nextInt();
		System.out.println("");
		if (one == two) {
			System.out.println("Your numbers are the same!");
		}
		else {
			System.out.println("Your numbers are different");
		}
	}
}
