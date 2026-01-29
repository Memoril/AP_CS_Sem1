/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please input an integer: ");
	int num1 = sc.nextInt();
	int num2 = num1 + 1;
	int num3 = num2 + 1;
	int num4 = num3 + 1;
	int num5 = num4 + 1;
	int num7 = num5 + 1;
	System.out.println("Here are the next 5 numbers!");
	System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num7);
	num2 = num1 * 2;
	num3 = num1 * 3;
	num4 = num1 * 4;
	num5 = num1 * 5;
	num7 = num1 * 6;
	System.out.println("Here are the next 5 multiples of " + num1 + "!");
	System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num7);
	double num6 = 1.0 * num1;
	num6 = num6 / 100;
	System.out.println("Here is " + num1 + " divided by 100!");
	System.out.println(num6);
	double num8 = num1 / 10.0;
	System.out.println("Here is " + num8 + " divided by 10!");
	System.out.println(num8);
	}
}
