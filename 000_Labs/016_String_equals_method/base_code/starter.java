/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String type = sc.nextLine();
		
		if (type.equals("Wizard") || type.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (type.equals("Warrior") || type.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if (type.equals("Rogue") || type.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else {
			System.out.println("Unknown class chosen.");
		}
		
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.println("Strength (1-10): ");
		int strn = sc.nextInt();
		int points = 20;
		int dex = 0;
		int inte = 0;
		int chari = 0;
		if (strn > 0 && strn <= 10 && strn <= points){
			points = points - strn;
			System.out.println("You have " + points + " points left to spend.");
		}
		else {
			System.out.println("Invalid input, strn value set to 0");
			strn = 0;
			points = points - strn;
			System.out.println("You have " + points + " points left to spend.");
		}
		System.out.println("Dexterity (1-10): ");
		dex = sc.nextInt();
		if (dex > 0 && dex <= 10 && dex <= points){
			points = points - dex;
			System.out.println("You have " + points + " points left to spend.");
		}
		else {
			System.out.println("Invalid input, dex value set to 0");
			dex = 0;
			points = points - dex;
			System.out.println("You have " + points + " points left to spend.");
		}
		System.out.println("Intelligence (1-10): ");
		inte = sc.nextInt();
		if (inte > 0 && inte <= 10 && inte <= points){
			points = points - inte;
			System.out.println("You have " + points + " points left to spend.");
		}
		else {
			System.out.println("Invalid input, inte value set to 0");
			inte = 0;
			points = points - inte;
			System.out.println("You have " + points + " points left to spend.");
		}
		System.out.println("Charisma (1-10): ");
		chari = sc.nextInt();
		if (chari > 0 && chari <= 10 && chari <= points){
			points = points - chari;
			System.out.println("You have " + points + " remaining.");
		}
		else {
			System.out.println("Invalid input, chari value set to 0");
			chari = 0;
			points = points - chari;
			System.out.println("You have " + points + " points left to spend.");
		}
		
		System.out.println("You are " + name + ", " + title + " of CVHS.");
		System.out.println("You are a " + type + " with the following stats!");
		System.out.println("Strength - " + strn);
		System.out.println("Dexterity - " + dex);
		System.out.println("Intelligence - " + inte);
		System.out.println("Charisma - " + chari);
		System.out.println("Good luck on your quest, " + name + "!");
	}
}
