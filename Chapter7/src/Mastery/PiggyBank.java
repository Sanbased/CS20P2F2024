 /*

Program: PiggyBank.java        Date: Dec 1st 2024

Purpose: supports MySavingsMastery by getting amoutns of coins, and total value of coins

School: CHHS
Course: Computer Science 20

*/
package Mastery;

public class PiggyBank {
	
	//declare coin type variables
	private int pennies;
	private int nickels;
	private int dimes;
	private int quarters;
	
	//constructor method to give coin variable values 
	//default value of 0
	public PiggyBank() {
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	// increases value of pennies variable by 1 (adds a penny)
	public void addPenny() {
		pennies++;
	}
	
	// increases value of nickels variable by 1 (adds a nickel)
	public void addNickel() {
		nickels++;
	}
	
	// increases value of dimes variable by 1 (adds a dime)
	public void addDime() {
		dimes++;
	}
	
	// increases value of quarters variable by 1 (adds a quarter)
	public void addQuarter() {
		quarters++;
	}
	
	// resets variable values to 0, so that there is no money left in the bank account and everything has been taken out
	public void takeMoneyOut() {
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	// calculates total by multiplying the number of coins times the value of 1 of that coin.
	//all these values are then added to get the total
	public double getTotal() {
		return pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
	}
}
//no test case for this class, please refer to MySavingsMastery class. 