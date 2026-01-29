/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		String inp1 = sc.nextLine();
		System.out.println("Write a sentence!");
		String inp2 = sc.nextLine();
		System.out.println();
		System.out.println("This is using the methods!");
		toString(inp1);
		toStringCombined(inp1, inp2);
	}
	public static void toString(String one){
		System.out.println(one);
	}
	public static void toStringCombined(String one, String two){
		System.out.print(one + " " + two);
	}
}
