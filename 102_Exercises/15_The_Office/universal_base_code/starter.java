/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee (2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee (2011, "Pam", "Beesly", 2250);
		Employee joe = new Employee (2425, "Joe", "Bart", 4500.34);
		
		michael.raiseSalary(20);
		dwight.raiseSalary(20);
		jim.raiseSalary(20);
		pam.raiseSalary(5);
		joe.raiseSalary(500);
		
		michael.employeeToString();
		double msalary = michael.getAnnualSalary();
		System.out.println("Annual salary: " + msalary);
		System.out.println("-----------------------------------");
		System.out.println();
		dwight.employeeToString();
		double dsalary = dwight.getAnnualSalary();
		System.out.println("Annual salary: " + dsalary);
		System.out.println("-----------------------------------");
		System.out.println();
		jim.employeeToString();
		double jsalary = jim.getAnnualSalary();
		System.out.println("Annual salary: " + jsalary);
		System.out.println("-----------------------------------");
		System.out.println();
		pam.employeeToString();
		double psalary = pam.getAnnualSalary();
		System.out.println("Annual salary: " + psalary);
		System.out.println("-----------------------------------");
		System.out.println();
		joe.employeeToString();
		double j2salary = joe.getAnnualSalary();
		System.out.println("Annual salary: " + j2salary);
		System.out.println("-----------------------------------");
		System.out.println();
	}
}
