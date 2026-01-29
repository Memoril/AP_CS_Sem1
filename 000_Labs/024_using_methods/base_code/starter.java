/*
 *	Author:  
 *  Date: 
*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		populateArrayList();
		System.out.println("Welcome to Nitrous Type ^TM!");
		System.out.println("It is currently " + getTime() + " and we're ready to play!");
		System.out.println("");
		System.out.println("Enter the integer of the corresponding mode you wish to play (or quit)!");
		System.out.println("1 - Type a random sentence as fast as you can!");
		System.out.println("2 - Choose a sentence you want to practice on!");
		System.out.println("3 - Quit!");
		int choice = sc.nextInt();
		while (choice != 3 && choice != 2 && choice != 1){
			System.out.println("Invalid input! Try again!");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("Enter the integer of the corresponding mode you wish to play (or quit)!");
			System.out.println("1. Type a random sentence as fast as you can!");
			System.out.println("2. Choose a sentence you want to practice on!");
			System.out.println("3. Quit!");
			choice = sc.nextInt();
		}
		while (choice == 1) {
			System.out.println("You've chosen to randomly select a sentence.");
			System.out.println();
			System.out.println("-----------------Your sentence is:-----------------");
			String typesentence = getSentence();
			System.out.println(typesentence);
			System.out.println("---------------------------------------------------");
			System.out.println();
			countdown();
			startTimer();
			sc.nextLine();
			String userinp = sc.nextLine();
			System.out.println("Nice job! Here is your result!");
			double time = endTimer();
			System.out.println("Time: " + time);
			int compare = compareSentences(typesentence,userinp);
			int letters = lettersInSentence(typesentence);
			int words = wordsInSentence(typesentence);
			int uletters = lettersInSentence(userinp);
			int uwords = wordsInSentence(userinp);
			System.out.println("Errors: " + compare + "/" + letters + " letters");
			double minute = time / 60;
			double lpm = uletters/minute;
			double wpm = uwords/minute;
			System.out.println(lpm + " letters per minute");
			System.out.println(wpm + " words per minute");
			System.out.println("---------------------------------------------------");
			System.out.println("Enter the integer of the corresponding mode you wish to play (or quit)!");
			System.out.println("1. Type a random sentence as fast as you can!");
			System.out.println("2. Choose a sentence you want to practice on!");
			System.out.println("3. Quit!");
			choice = sc.nextInt();
		}
		while (choice == 2) {
			System.out.println("Please enter what number sentence you'd like to play: ");
			int userinp2 = sc.nextInt();
			while (userinp2 < 0 || userinp2 >= 100) {
				System.out.println("You did not select correctly, please try again.");
				System.out.println("---------------------------------------------------");
				System.out.println("Please enter what number sentence you'd like to play: ");
				userinp2 = sc.nextInt();
			}
			String sentence2 = getSentence(userinp2);
			System.out.println("-----------------Your sentence is:-----------------");
			System.out.println(sentence2);
			System.out.println("---------------------------------------------------");
			System.out.println();
			countdown();
			startTimer();
			sc.nextLine();
			String sentenceinp2 = sc.nextLine();
			System.out.println("Nice job! Here is your result!");
			double time2 = endTimer();
			System.out.println("Time: " + time2);
			int compare2 = compareSentences(sentence2,sentenceinp2);
			int letters2 = lettersInSentence(sentence2);
			int words2 = wordsInSentence(sentence2);
			int uletters2 = lettersInSentence(sentenceinp2);
			int uwords2 = wordsInSentence(sentenceinp2);
			System.out.println("Errors: " + compare2 + "/" + letters2 + " letters");
			double minute2 = time2 / 60;
			double lpm2 = uletters2/minute2;
			double wpm2 = uwords2/minute2;
			System.out.println(lpm2 + " letters per minute");
			System.out.println(wpm2 + " words per minute");
			System.out.println("---------------------------------------------------");
			System.out.println("Enter the integer of the corresponding mode you wish to play (or quit)!");
			System.out.println("1. Type a random sentence as fast as you can!");
			System.out.println("2. Choose a sentence you want to practice on!");
			System.out.println("3. Quit!");
			choice = sc.nextInt();
		}
	}

	// This method returns the local current time as a String
	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	// This method starts a clock that can be used throughout the program
	public static void startTimer(){
		startTime = System.nanoTime();
	}

	// This method stops the timer clock and returns a double of the seconds and milliseconds of the stopwatch
	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		return decSeconds;
	}

	// This method does a 3 second countdown and prints it to the terminal
	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	// This method sets up a list of sentences to be called from. 
	// This should only be called once prior to getting sentences.
	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	// This chooses 1 of the 100 sentences in the list to return.
	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	// This returns the same sentence for the same integer given.
	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	//  This returns the number of letters, spaces, and punctuations in a sentence.
	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	// This returns the number of words in a sentence
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	// This method does a letter by letter comparison of each word and returns the number of errors.
	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		return errors;
	}

}
