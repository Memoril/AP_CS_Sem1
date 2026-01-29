/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/
		Scanner sc = new Scanner(System.in);
		int a = (int) (Math.random()*1 + 2);
		System.out.println("Please enter a word that you'd like to hide in a crossword:");
		String inp = sc.nextLine();
		
		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
        String [][] x = new String [inp.length() + 5][inp.length() + 5];
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("-----Crossword Puzzle-----");
		for (int i = 0; i<x.length; i++) {
			for (int o = 0; o<x[0].length; o++) {
				x[i][o] = letters[(int) (Math.random()*letters.length)];
			}
		}
		if(a == 0){
			vertical(x, inp);
		}
		if(a == 1){
			horizontal(x, inp);
		}
		if(a == 2){
			diagonal(x, inp);
		}
		
		for (String[] rows: x) {
			for (String val: rows) {
				System.out.print(val + " ");
			}
			System.out.println("");
		}
	}
	
	public static String[][] vertical(String [][] arr, String i) {
		int b = (int) (Math.random()*(arr.length + 1 - i.length()));
		int c = (int) (Math.random()*(arr[0].length + 1));
		for(int a = 0; a<i.length(); a++) {
			arr[b+a][c] = i.substring(a, a+1);
		}
		return arr;
	}
	public static String[][] horizontal(String [][] arr, String i) {
		int b = (int) (Math.random()*(arr.length + 1));
		int c = (int) (Math.random()*(arr[0].length + 1 - i.length()));
		for(int a = 0; a<i.length(); a++) {
			arr[b][c+a] = i.substring(a, a+1);
		}
		return arr;
	}
	public static String[][] diagonal(String [][] arr, String i) {
		int b = (int) (Math.random()*(arr.length + 1 - i.length()));
		int c = (int) (Math.random()*(arr[0].length + 1 - i.length()));
		for(int a = 0; a<i.length(); a++) {
			arr[b+a][c+a] = i.substring(a, a+1);
		}
		return arr;
	}
}