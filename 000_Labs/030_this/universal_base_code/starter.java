/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		PooleDwarf a = new PooleDwarf();
		PooleDwarf b = new PooleDwarf();
		PooleDwarf c = new PooleDwarf();
		PooleDwarf d = new PooleDwarf();
		PooleDwarf e = new PooleDwarf();
		PooleDwarf f = new PooleDwarf();
		PooleDwarf g = new PooleDwarf();
		
		a.setName(randName());
		a.setAge(20);
		b.setName(randName());
		b.setAge(46);
		c.setName(randName());
		c.setAge(72);
		d.setName(randName());
		d.setAge(25);
		e.setName(randName());
		e.setAge(18);
		f.setName(randName());
		f.setAge(34);
		g.setName(randName());
		g.setAge(38);
		
		boolean one = a.isSameName(b.getName());
		boolean two = a.isSameName(c.getName());
		boolean three = a.isSameName(d.getName());
		boolean four = a.isSameName(e.getName());
		boolean five = a.isSameName(f.getName());
		boolean six = a.isSameName(g.getName());
		
		int rep = 0;
		int coun = 0;
		while (coun < 6) {
			if (one == true && coun == 0) {
				rep = rep + 1;
			}
			if (two == true && coun == 1) {
				rep = rep + 1;
			}
			if (three == true && coun == 2) {
				rep = rep + 1;
			}
			if (four == true && coun == 3) {
				rep = rep + 1;
			}
			if (five == true && coun == 4) {
				rep = rep + 1;
			}
			if (six == true && coun == 5) {
				rep = rep + 1;
			}
			coun = coun + 1;
		}
		System.out.println(a.getName() + " was the name with " + rep + " matches!");
		System.out.println();
		System.out.println("-------- Dwarf Info --------");
		System.out.println("The second dwarf was named: " + b.getName());
		System.out.println("The third dwarf was named: " + c.getName());
		System.out.println("The fourth dwarf was named: " + d.getName());
		System.out.println("The fifth dwarf was named: " + e.getName());
		System.out.println("The sixth dwarf was named: " + f.getName());
		System.out.println("The seventh dwarf was named: " + g.getName());
	}
}
