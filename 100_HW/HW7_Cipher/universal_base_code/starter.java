/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
//	String code = sc.nextLine();
//	String solv = encode(code);
//	System.out.println("Encoded no key: " + solv);
	String keycode = sc.nextLine();
	int keycode2 = sc.nextInt();
	String solv2 = keyedEncode(keycode, keycode2);
	System.out.println("Encoded with key: " + solv2);
	}
//	public static String encode(String a) {
//		return Cipher.encode(a);
//	}
	public static String keyedEncode(String a, int b) {
		return Cipher.keyedEncode(a,b);
	}
}
