/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int base = sc.nextInt();
		System.out.println("What is your exponent number?");
		int exp = sc.nextInt();
		int y = exp(base, exp);
		System.out.println("Your answer is: " + y);
	}
	public static int exp(int a, int b){
		int x = 1;
		while (b > 0){
			x = x * a;
			b = b - 1;
		}
		return x;
	}
}
