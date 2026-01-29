import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int str1 = check(passwords);
		int str2 = check2(passwords);
		int str3 = check3(passwords);
		
		System.out.println("There are " + str1 + " passwords of strength 1 with 8 or more characters.");
		System.out.println("There are " + str2 + " passwords of strength 2 with a special symbol.");
		System.out.println("There are " + str3 + " passwords of strength 3 with both strength 1 and 2.");
		System.out.println("There are " + (passwords.length-str1-str2-str3) + " passwords with no strength.");
		
	}
	public static int check(String[] arr) {
	    int c = 0;
	    boolean r = false;
	    for (int q = 0; (q < arr.length); q++) {
	        String[] x = new String[arr[q].length()];
	        r = arr[q].length() >= 8;
	        if(r) {
	            c++;
	        }
	    }
	    return c;
	}
	public static int check2(String[] arr) {
	    int c2 = 0;
	    boolean e = false;
	    for (int q = 0; (q < arr.length); q++) {
	        String[] x = new String[arr[q].length()];
	        e = arr[q].contains("!") || arr[q].contains("@") || arr[q].contains("#") || arr[q].contains("$") || arr[q].contains("%") || arr[q].contains("^") || arr[q].contains("&") || arr[q].contains("*") || arr[q].contains("(") || arr[q].contains(")");
	        if(e) {
	            c2++;
	        }
	    }
	    return c2;
	}
	public static int check3(String[] arr) {
	    int c3 = 0;
	    boolean e = false;
	    boolean r = false;
	    for (int q = 0; (q < arr.length); q++) {
	        String[] x = new String[arr[q].length()];
	        r = arr[q].length() >= 8;
	        e = arr[q].contains("!") || arr[q].contains("@") || arr[q].contains("#") || arr[q].contains("$") || arr[q].contains("%") || arr[q].contains("^") || arr[q].contains("&") || arr[q].contains("*") || arr[q].contains("(") || arr[q].contains(")");
	        if(r && e) {
	            c3++;
	        }
	    }
	    return c3;
	}
}
