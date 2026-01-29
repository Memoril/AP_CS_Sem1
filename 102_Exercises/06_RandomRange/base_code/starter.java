/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 numbers to create a range for your random number");
			System.out.println("Please enter an integer: ");
			int first = sc.nextInt();
			System.out.println("Please enter another integer (bigger than the first): ");
			int second = sc.nextInt();
			
			int one = (int) (Math.random() * (second-first) + first);
			int two = (int) (Math.random() * (second-first) + first);
			int three = (int) (Math.random() * (second-first) + first);
			int four = (int) (Math.random() * (second-first) + first);
			int five = (int) (Math.random() * (second-first) + first);
			
			if (first < second) {
			
				System.out.println("Your range is " + first + " to " + second + ".");
				System.out.println("Here are 5 numbers generated in that range.");
				System.out.print(one + ", " + two + ", " + three + ", " + four + ", " + five);
			}
			else{
				System.out.print("try again");
			}
	}
}
