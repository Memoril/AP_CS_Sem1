/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Spiderman a = new Spiderman("Tobey Maguire", 48, "Green Goblin");
	Spiderman b = new Spiderman("Andrew Garfield", 40, "Electro");
	Spiderman c = new Spiderman("Tom Holland", 29, "The Vulture");
	Spiderman d = new Spiderman();
	
	d.setActor("Miles Morales");
	d.setAge(16);
	d.setVillain("Kingpin");
	
	
	String name = a.getActor();
	System.out.println(name);
	int age = a.getAge();
	System.out.println(age);
	String villain = a.getVillain();
	System.out.println(villain);
	System.out.println("----------------");
	
	String name1 = b.getActor();
	System.out.println(name1);
	int age1 = b.getAge();
	System.out.println(age1);
	String villain1 = b.getVillain();
	System.out.println(villain1);
	System.out.println("----------------");
	
	String name2 = c.getActor();
	System.out.println(name2);
	int age2 = c.getAge();
	System.out.println(age2);
	String villain2 = c.getVillain();
	System.out.println(villain2);
	System.out.println("----------------");
	
	String name3 = d.getActor();
	System.out.println(name3);
	int age3 = d.getAge();
	System.out.println(age3);
	String villain3 = d.getVillain();
	System.out.println(villain3);
	System.out.println("----------------");
	
	
	
	}
}
