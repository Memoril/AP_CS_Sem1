/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rouge?");
		String w = sc.nextLine();
		if (w.equals("Wizard") || w.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		if (w.equals("Warrior") || w.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		if (w.equals("Rogue") || w.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
	}
}
