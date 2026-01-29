/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a number from 1-1000: ");
		int num = sc.nextInt();
		int rndm = (int) (Math.random() * 1000 + 1);
		
		if (num == rndm) {
			System.out.println("WOW! You guessed the correct number! Congrats!");
		}
		else if (num > rndm) {
			System.out.println("Your number was larger than the random number. The number was " + rndm + ".");
		}
		else if (num < rndm) {
			System.out.println("Your number was less than the random number. The number was " + rndm + ".");
		}
	}
}
