/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cash = 100;
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------------");
		System.out.println("Would you like to play the slots? (Yes/No/yes/no/Y/N/y/n)");
		String yorn = sc.nextLine();
		
		
		while (yorn.equals ("Yes") || yorn.equals ("yes") || yorn.equals ("Y") || yorn.equals ("y")) {
			System.out.println("You have $" + cash + ". How much would you like to wager?");
			int wage = sc.nextInt();
			while(wage > cash || wage <= 0) {
				System.out.println("You only have $" + cash + "! Please enter a smaller number: ");
				wage = sc.nextInt();
			}
			cash = cash - wage;
			System.out.println("Great! Lets play!!!");
			System.out.println("Your rolls are:");
			int a = (int) (Math.random() * 10 + 1);
			int b = (int) (Math.random() * 10 + 1);
			int c = (int) (Math.random() * 10 + 1);
			System.out.println("_________________________");
			System.out.println("   | " + a + " | " + b + " | " + c + " | ");
			System.out.println("_________________________");
			if (a == b && a == c) {
				System.out.println("Jackpot!!! Your wager has now been tripled!");
				cash = cash + (wage * 3);
				System.out.println("You now have $" + cash + ".");
			}
			else if (a == b || a == c || b == c) {
				System.out.println("You won! Your wager has now been doubled!");
				cash = cash + (wage * 2);
				System.out.println("You now have $" + cash + ".");
			}
			else {
				System.out.println("You didn't win this time, better luck next time!");
				System.out.println("You now have $" + cash + ".");
			}
			System.out.println("-------------------------------------------------------------");
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y/No/no/N/n): ");
			sc.nextLine();
			yorn = sc.nextLine();
			
			if (yorn.equals ("No") || yorn.equals ("no") || yorn.equals ("N") || yorn.equals ("n")) {
				break;
			}
			else if (cash <= 0) {
				break;
			}
		}
		if (cash <= 0) {
			System.out.println("You have $" + cash + ". Go home!");
		}
		else {
			System.out.println("Sad to see you go! You still have $" + cash + " left. Come again soon! Thanks for playing!");	
		}
	}
}
