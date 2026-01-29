/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many cookies would you like?");
		int inp = sc.nextInt();
		String inp2;
		sc.nextLine();
		ArrayList<String>cookies = new ArrayList<String>();
		for (int i = 0; i<inp; i++){
			System.out.println("What would you like your #" + (i + 1) + " cookie to be?");
			inp2 = sc.nextLine();
			cookies.add(i, inp2);
		}
		System.out.println("--------------------------------------------------");
		for (int i = 0; i<inp; i++){
			System.out.println("Cookie #" + (i+1) + ": " + cookies.get(i));
		}
	}
}
