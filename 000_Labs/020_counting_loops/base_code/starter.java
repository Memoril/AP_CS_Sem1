/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times should I print your name?");
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {
			if (count == num) {
				break;
			}
			System.out.println(name);
			count = count + 1;
		}
	}
}
