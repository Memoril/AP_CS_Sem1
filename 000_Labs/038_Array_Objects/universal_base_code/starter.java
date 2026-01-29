/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard[] x = new Wizard[100];
		Warrior[] y = new Warrior[100];
		for (int i=0; (i<x.length); i++) {
			x[i] = new Wizard();
			y[i] = new Warrior();
		}
		int c = 0;
		int c2 = 0;
		int win = 0;
		boolean t = false;
		while (!x[c].isDead() || !y[c2].isDead()) {
			x[c].attack(y[c2]);
			if (y[c2].isDead()) {
				c2++;
			}
			if (!(c2 < y.length)) {
				t = true;
				break;
			}
			y[c2].attack(x[c]);
			if (x[c].isDead()) {
				c++;
			}
			if (!(c < x.length)) {
				t = false;
				break;
			}
		}
		if (t) {
			win = 100 - c;
			System.out.println("Wizards won with " + win + " left in their army.");
		}
		else {
			win = 100 - c2;
			System.out.println("Warriors won with " + win + " left in their army.");
		}
	}
}
