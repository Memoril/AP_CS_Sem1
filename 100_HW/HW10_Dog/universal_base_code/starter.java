/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("What would you like to name your dog? ");
		String na = sc.nextLine();
		System.out.print("How old is your dog? ");
		int ag = sc.nextInt();
		Dog a = new Dog(na, ag);
		Dog b = new Dog("Dustin", "Poodle");
		
		System.out.println(a.getName() + " is a " + a.getBreed() + " that is " + a.getAge() + ".");
		System.out.println(b.getName() + " is a " + b.getBreed() + " that is " + b.getAge() + ".");
		
		boolean fdog = a.isSleeping();
		if (fdog) {
			System.out.println(a.getName() + " is sleeping!");
		}
		else {
			System.out.println(a.getName() + " is awake!");
			a.bark();
		}
		
		boolean sdog = b.isSleeping();
		if (sdog && !fdog) {
			System.out.println(b.getName() + " was awaken by " + a.getName() + "!");
			b.bark();
		}
		else if (sdog) {
			System.out.println(b.getName() + " is sleeping too!");
		}
		else if (!sdog && !fdog) {
			System.out.println(b.getName() + " hears " + a.getName() + "!");
			b.bark();
		}
		else if (!sdog) {
			System.out.println(b.getName() + " is awake and doing nothing in particular.");
		}
	}
}
