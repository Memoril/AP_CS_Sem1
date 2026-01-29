/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String word = "phone";
		System.out.println(word);
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println("");
		System.out.println("It's technology you use every day!");
		System.out.println("What's your guess? ");
		String one = sc.nextLine();
		if ((one) .equals (word)) {
			System.out.println("");
			System.out.println("Bingo! You win!!!");
		}
		else {
			System.out.println("");
			System.out.println("You didn't guess it correctly, but here's another hint!");
			System.out.println("You can use it on the move to access the internet easily!");
			System.out.println("What's your final guess? ");
			one = sc.nextLine();
			if ((one) .equals (word)) {
				System.out.println("");
				System.out.println("Bingo! You win!!!");
			}
			else {
				System.out.println("");
				System.out.println("The answer was a " + word + " better luck next time!");
			}
		}
		
	}
}
