/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rannum = (int) (Math.random() * 1000 + 1);
		System.out.println("Please enter a number between 1 and 1000: ");
		int gue = sc.nextInt();
		while (gue != rannum){
			if (gue == rannum){
			System.out.println("You got the number!!! Congrats!");
			break;
			}
			else if (gue > rannum){
				System.out.println("Your number was too high, guess again.");
			}
			else if (gue < rannum){
				System.out.println("Your number was too low, guess again.");
			}
			
			System.out.println("Please enter a number between 1 and 1000: ");
			gue = sc.nextInt();
		}
		if (gue == rannum){
			System.out.println("You got the number!!! Congrats!");
		}
	}
}
