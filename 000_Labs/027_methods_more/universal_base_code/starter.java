/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our WELLS FARGONE™ ATM! Create an account TODAY!");
		System.out.println();
		System.out.print("Account name?: ");
		String name = sc.nextLine();
		System.out.print("Account balance?: $");
		double balance = sc.nextDouble();
		while (balance < 0) {
			System.out.println("( ͡° ⏥͡° )");
			System.out.println("Mood Awful ⬇️⬇️⬇️");
			System.out.print("Invalid amount. Please enter a value larger than 0: ");
			balance = sc.nextDouble();
		}
		System.out.println();
		System.out.print("Would you like to activate this account? (t/f): ");
		sc.nextLine();
		String torf = sc.nextLine();
		while (!torf.equals("t") || !torf.equals("f")) {
			if (torf.equals("t") || torf.equals("f")){
				break;
			}
			System.out.println("😢");
			System.out.print("Invalid input. Please enter t/f: ");
			torf = sc.nextLine();
		}
		boolean active;
		if (torf.equals("t")) {
			active = true;
		}
		else {
			active = false;
		}
		System.out.println("--------------------------");
		System.out.println("( ❛ ‿‿ ❛ )");
		System.out.println();
		
		BankAccount x = new BankAccount();
		BankAccount y = new BankAccount("Doug");
		BankAccount z = new BankAccount("Doug Jr", 1002.56);
		BankAccount input = new BankAccount(name, balance, active);
		x.checkBalance();
		x.displayAccountInfo();
		System.out.println("--------------------------");
		System.out.println("( ͡❛ ᴗ ͡❛)");
		System.out.println();
		y.checkBalance();
		y.displayAccountInfo();
		System.out.println("--------------------------");
		System.out.println("( °︠ ⏥ ︡°)¯");
		System.out.println();
		z.checkBalance();
		z.displayAccountInfo();
		System.out.println("--------------------------");
		System.out.println("(❛̃ ᴗ❛̃)");
		System.out.println();
		input.checkBalance();
		input.displayAccountInfo();
		System.out.println("--------------------------");
		System.out.println("【•̃ ᴗ•̃】");
		System.out.println();
	}
}
