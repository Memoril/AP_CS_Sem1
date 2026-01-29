/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String [] arr = new String [10];
		arr[0] = ("Take him into church, you know your mom and nem goin'");
		arr[1] = ("To praise a King with a crown that's provided with thorns");
		arr[2] = ("Breakin' rules, shkippin' school, pullin' fire alarms");
		arr[3] = ("Got with a crew, made a truce, an alliance was formed");
		arr[4] = ("Got a tool, start shootin', then the violence was born");
		arr[5] = ("The world spinnin' as he look into the eye of the shtorm");
		arr[6] = ("Pray for the boy, bow head, then lock arms");
		arr[7] = ("And lock your car doors, he could trigger the alarm");
		arr[8] = ("Got caught one time, and they left him with just a warnin'");
		arr[9] = ("Got baptized in cold water, it turned warm");
		int x = 0;
		while (x < arr.length) {
			System.out.println(arr[x]);
			x++;
		}
	}
}
