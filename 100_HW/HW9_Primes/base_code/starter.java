/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number and we'll print out every prime until that number: ");
		int inpnum = sc.nextInt();
		System.out.println("---------------");
		System.out.println();
		printPrimes(inpnum);
	}
	public static boolean checkPrime(int a) {
		int loopc = 2;
		int check = a;
		int x = 0;
		while (loopc <= a) {
			if (loopc == a) {
				return true;
			}
			x = check % loopc;
			if (x == 0) {
				return false;
			}
			loopc = loopc + 1;
		}
		return true;
	}
	public static void printPrimes(int b) {
		int hprime = b;
		int lcount = 2;
		while (lcount < hprime) {
			boolean check = checkPrime(lcount);
			if (check) {
				System.out.println(lcount);
			}
			lcount = lcount + 1;
		}
	}
}
