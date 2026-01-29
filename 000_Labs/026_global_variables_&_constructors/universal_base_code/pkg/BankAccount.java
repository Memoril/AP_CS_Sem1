/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	int acctn;
	double balan;
	boolean isActive;
	
	private static int nextAccountNumber = (int)(Math.random() * (1000-50) + 50);
	// -------CONSTRUCTORS-------
	public BankAccount() {
		owner = "Unknown";
		acctn = nextAccountNumber;
		balan = 0;
		isActive = true;
		nextAccountNumber = nextAccountNumber + 1;
	}
	public BankAccount(String a) {
		owner = a;
		acctn = nextAccountNumber;
		balan = 0;
		isActive = true;
		nextAccountNumber = nextAccountNumber + 1;
	}
	public BankAccount(String a, double b) {
		owner = a;
		acctn = nextAccountNumber;
		balan = b;
		isActive = true;
		nextAccountNumber = nextAccountNumber + 1;
	}
	

	// -------METHODS-------
	
}