/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word or phrase: ");
		String inp = sc.nextLine();
		String [] x = new String[inp.length()];
		System.out.println();
		System.out.println("Your word/phrase as sPoNgE cAsE:");
		
		while (inp.indexOf(" ")!= -1){
			String word = inp.substring(0,inp.indexOf(" "));
			System.out.print(spongeWord(word) + " ");
			inp = inp.substring(inp.indexOf(" ") +1);
		}
	System.out.print(spongeWord(inp));
	}
public static String spongeWord(String word){
	String ans = "";
		for (int i=0; i < word.length(); i++){
			String letter = word.substring(i,i+1);
			if (i % 2 != 1) {
				letter = letter.toLowerCase();
			}
			else {
				letter = letter.toUpperCase();
			}
			ans = ans + letter;
		}
		return ans;
}
}
