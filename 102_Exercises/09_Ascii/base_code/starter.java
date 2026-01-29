/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter with the following B A D ");
		String first = sc.nextLine();
		String second = sc.nextLine();
		String third = sc.nextLine();
		
		int row = 0;
		while (row < 5) {
			if (first.equals("B")){
				if (row == 0) System.out.print("**** "); 
				if (row == 1) System.out.print("*   *"); 
				if (row == 2) System.out.print("**** "); 
				if (row == 3) System.out.print("*   *"); 
				if (row == 4) System.out.print("**** ");
			}
			if (first.equals("A")){
				if (row == 0) System.out.print("  *  "); 
				if (row == 1) System.out.print("*   *"); 
				if (row == 2) System.out.print("*****"); 
				if (row == 3) System.out.print("*   *"); 
				if (row == 4) System.out.print("*   *");
			}
			if (first.equals("D")){
				if (row == 0) System.out.print("**** "); 
				if (row == 1) System.out.print("*   *"); 
				if (row == 2) System.out.print("*   *"); 
				if (row == 3) System.out.print("*   *"); 
				if (row == 4) System.out.print("**** ");
			}
			System.out.print("  ");
			
			if (second.equals("B")){
				if (row == 0) System.out.print("**** "); 
				if (row == 1) System.out.print("*   *"); 
				if (row == 2) System.out.print("**** "); 
				if (row == 3) System.out.print("*   *"); 
				if (row == 4) System.out.print("**** ");
			}
			if (second.equals("A")){
				if (row == 0) System.out.print("  *  "); 
				if (row == 1) System.out.print("*   *"); 
				if (row == 2) System.out.print("*****"); 
				if (row == 3) System.out.print("*   *"); 
				if (row == 4) System.out.print("*   *");
			}
			if (second.equals("D")){
				if (row == 0) System.out.print("**** "); 
				if (row == 1) System.out.print("*   *"); 
				if (row == 2) System.out.print("*   *"); 
				if (row == 3) System.out.print("*   *"); 
				if (row == 4) System.out.print("**** ");
			}
			System.out.print("  ");
			
			if (third.equals("B")){
				if (row == 0) System.out.print("**** "); 
				if (row == 1) System.out.print("*   *"); 
				if (row == 2) System.out.print("**** "); 
				if (row == 3) System.out.print("*   *"); 
				if (row == 4) System.out.print("**** ");
			}
			if (third.equals("A")){
				if (row == 0) System.out.print("  *  "); 
				if (row == 1) System.out.print("*   *"); 
				if (row == 2) System.out.print("*****"); 
				if (row == 3) System.out.print("*   *"); 
				if (row == 4) System.out.print("*   *");
			}
			if (third.equals("D")){
				if (row == 0) System.out.print("**** "); 
				if (row == 1) System.out.print("*   *"); 
				if (row == 2) System.out.print("*   *"); 
				if (row == 3) System.out.print("*   *"); 
				if (row == 4) System.out.print("**** ");
			}
			System.out.println();
			row = row + 1;
		}
		sc.close();
	}
}
