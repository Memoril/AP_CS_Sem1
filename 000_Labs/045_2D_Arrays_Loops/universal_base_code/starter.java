/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int c = 0;
		double ravr = 0;
		double tavr = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows would you like for your 2D array?");
		int row = sc.nextInt();
		System.out.println("How many columns would you like for your 2D array?");
		int col = sc.nextInt();
		int [][] x = new int [row][col];
		for(int i = 0; i < x.length; i++){
			for (int o = 0; o < x[0].length; o++){
				x[i][o] = (int) (Math.random()*9 + 1);
				c++;
			}
		}
		System.out.println("---------------------------------------");
		for(int i = 0; i < x.length; i++){
			for (int o = 0; o < x[0].length; o++){
				System.out.print(x[i][o] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		System.out.println("What row would you like to get the average of?");
		int inpr = sc.nextInt();
		ravr = raverage(x[inpr]);
		System.out.println("The row average is " + ravr);
		tavr = average(x, c);
		System.out.println("The average of the 2D array is " + tavr);
	}
	public static double raverage(int [] z){
		double savr = 0;
		for(int i = 0; i < z.length; i++){
			savr = savr + z[i];
		}
		savr = savr/z.length;
		return savr;
	}
	public static double average(int [][] y, int a){
		double avr = 0;
		for(int i = 0; i < y.length; i++){
			for (int o = 0; o < y[0].length; o++){
				avr = y[i][o] + avr;
			}
		}
		avr = avr / a;
		return avr;
	}
	
}
