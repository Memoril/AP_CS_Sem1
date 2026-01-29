/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String x = sc.nextLine();
		System.out.println("Here's your sentence in Pig Latin!");
		int s = 0;
		String w = " ";
		//int c = 0;
		
		while(x.indexOf(" ") != -1) {
		s = x.indexOf(" ");
		w = x.substring(0, s);
		System.out.print(pig_Latin(w) + " ");
		x = x.substring(s+1);
		//c++;
		}
		System.out.println(pig_Latin(x));
		//System.out.println(c);
	}
	public static String pig_Latin(String a){
		if(a.substring(0, 1).equals("a") || a.substring(0, 1).equals("e") || a.substring(0, 1).equals("i") || a.substring(0, 1).equals("o") || a.substring(0, 1).equals("u")) {
			return a = a + "-way";
		}
		if (a.length() > 1 && (a.substring(1, 2).equals("a") || a.substring(1, 2).equals("e") || a.substring(1, 2).equals("i") || a.substring(1, 2).equals("o") || a.substring(1, 2).equals("u"))) {
			return a = a.substring(1) + "-" + a.substring(0,1) + "ay";
		}
		if (a.length() > 2) {
			return a.substring(2) + "-" + a.substring(0, 2) + "ay";
		}
		return a;
	}
}
