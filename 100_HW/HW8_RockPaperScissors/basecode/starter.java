/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play the computer? (yes/no/done): ");
        String yornd = sc.nextLine();
        
        while (!yornd.equals ("yes") && !yornd.equals ("no") && !yornd.equals ("done")) {
            System.out.println("You typed an invalid input!");
            System.out.println("Would you like to play the computer? (yes/no/done): ");
            yornd = sc.nextLine();
        }
        
        while (yornd.equals ("yes") || yornd.equals ("no")) {
        while (yornd.equals ("yes")) {
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            System.out.println("Please enter rock/paper/scissors:");
            String rps = sc.nextLine();
            while (!rps.equals ("rock") && !rps.equals ("paper") && !rps.equals ("scissors")) {
            System.out.println("Invalid input, please type in rock/paper/scissors:");
            rps = sc.nextLine();
            }
            String comp = getObject();
            int win = compare2(rps, comp);
            if (win == 1) {
                System.out.println("You won!!!");
            }
            else if (win == 2) {
                System.out.println("You lost! :(");
            }
            else {
                System.out.println("You tied!");
            }
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            System.out.println("Would you like to play the computer? (yes/no/done): ");
            yornd = sc.nextLine();
            while (!yornd.equals ("yes") && !yornd.equals ("no") && !yornd.equals ("done")) {
            System.out.println("You typed an invalid input!");
            System.out.println("Would you like to play the computer? (yes/no/done): ");
            yornd = sc.nextLine();
            }
        }
        
        while (yornd.equals ("no")) {
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            System.out.println("How many times would you like the computer to play itself?");
            int times = sc.nextInt();
            sc.nextLine();
            int counter = 0;
            int tie0 = 0;
            int win1 = 0;
            int win2 = 0;
            while (times > counter) {
                String comp1 = getObject();
                String comp2 = getObject();
                int win = compare2(comp1, comp2);
                if (win == 1) {
                    win1 = win1 + 1;
                }
                else if (win == 2) {
                    win2 = win2 + 1;
                }
                else {
                    tie0 = tie0 + 1;
                }
                counter = counter + 1;
            }
            System.out.println("Player 1 wins: " + win1);
            System.out.println("Player 2 wins: " + win2);
            System.out.println("Ties: " + tie0);
            
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            System.out.println("Would you like to play the computer? (yes/no/done): ");
            yornd = sc.nextLine();
            while (!yornd.equals ("yes") && !yornd.equals ("no") && !yornd.equals ("done")) {
            System.out.println("You typed an invalid input!");
            System.out.println("Would you like to play the computer? (yes/no/done): ");
            yornd = sc.nextLine();
            }
        }
        if (yornd.equals ("done")) {
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            System.out.println("Thanks for playing!");
        }
        }
    }
    
    public static String getObject() {
        int a = (int) (Math.random() * 3 + 1);
        if (a == 1){
            return ("rock");
        }
        else if (a == 2){
            return ("paper");
        }
        else {
            return ("scissors");
        }
    }
    
    public static int compare2(String p1, String p2) {
        if (p1.equals (p2)) {
            return 0;
        }
        else if (p1.equals ("rock") && p2.equals ("paper")) {
            return 2;
        }
        else if (p1.equals ("paper") && p2.equals ("scissors")) {
            return 2;
        }
        else if (p1.equals ("scissors") && p2.equals ("rock")) {
            return 2;
        }
        else if (p1.equals ("rock") && p2.equals ("scissors")) {
            return 1;
        }
        else if (p1.equals ("paper") && p2.equals ("rock")) {
            return 1;
        }
        else if (p1.equals ("scissors") && p2.equals ("paper")) {
            return 1;
        }
        return 0;
    }
}
