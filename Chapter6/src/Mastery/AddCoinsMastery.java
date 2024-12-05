 /*

Program: AddCoinsMastery.java        Date: Nov 5th 2024

Purpose: add different coins and calcualte total

School: CHHS
Course: Computer Science 20

*/
package Mastery;
import java.util.Scanner;
public class AddCoinsMastery {
	public static void main(String[] args) {
	    
		Scanner userInput = new Scanner(System.in);
		
		//prompting the user for the amount of each type of coin
		
		System.out.print("Enter amount of quarters:");
		int quart = userInput.nextInt(); // stores # of  Quarters entered by user
		
		System.out.print("Enter amount of dimes:");
		int dimes = userInput.nextInt(); // stores # of Dimes entered by user
		
		System.out.print("Enter amount of nickels:");
		int nicks = userInput.nextInt(); // stores # of Nickels entered by user
		
		System.out.print("Enter amount of pennies:");
		int pens = userInput.nextInt(); // stores # of Pennies entered by user
		
		//Calculating the dollar amount using the getDollarAmount method 
		String TotalAmount = getDollarAmount(quart, dimes, nicks, pens) ;
		
		// prints total Dollar amount
		 System.out.println("Total:" + TotalAmount);
// getDollarAmount method calculates dollar amount and prints it with a $ sign and as a string rounded to two decimals 
	}
	public static String getDollarAmount(int quart, int dimes, int nicks, int pens) {
		
		// calculate the value of coins in dollars 
		double total = (quart *0.25) + (dimes * 0.10) + (nicks *0.05) + (pens *0.01); 
		
		// total amount is rounded to 2 decimal places and $ sign is added 
		return String.format("$%.2f", total);
	}
}
/* Screen Dump

Test Case 1:
Enter amount of quarters:4
Enter amount of dimes:4
Enter amount of nickels:4
Enter amount of pennies:4
Total:$1.64

Test Case 2:
Enter amount of quarters:8
Enter amount of dimes:7
Enter amount of nickels:6
Enter amount of pennies:9
Total:$3.09

 */