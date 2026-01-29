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
	public BankAccount(String a, double b, boolean c) {
		owner = a;
		acctn = nextAccountNumber;
		balan = b;
		isActive = c;
		nextAccountNumber = nextAccountNumber + 1;
	}
	
	// -------METHODS-------
	public void checkBalance() {
		System.out.println("Account Balance of " + owner + ": $" + balan);
	}
	public void displayAccountInfo() {
		System.out.println("--- Account Info ---");
		System.out.println("Account owner: " + owner);
		System.out.println("Account number: " + acctn);
		System.out.println("Account balance: $" + balan);
		System.out.println("Account operating status: " + isActive);
		System.out.println();
	}
	
	
	public String getOwner(){ //good
		return owner;
	}
	public void setOwner(String a){ //good
		owner = a;
	}
	public double getBalance(){ //good
		return balan;
	}
	public void closeAccount(){
		System.out.println("Account closed for " + owner);
		isActive = false;
	}
	public void isActive(){
		isActive = true;
	}
	public void deposit(double a){
		if (isActive == false) {
			System.out.println("Account is closed. Cannot deposit.");
		}
		else {
		balan = balan + a;
		System.out.println("Deposited $" + a);
		}
	}
	public void withdraw(double a){
		if (a>balan) {
			System.out.println("Insufficient Funds!");
		}
		else {
			balan = balan - a;
			System.out.println("Withdrew $" + a);
		}
	}
}