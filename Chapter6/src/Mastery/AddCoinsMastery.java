package Mastery;
import java.util.Scanner;
public class AddCoinsMastery {
	public static void main(String[] args) {
	    
		Scanner userInput = new Scanner(System.in);
		
		//prompting the user for the amount of each type of coin
		
		System.out.print("Enter amount of quarters:");
		int quart = userInput.nextInt();
		
		System.out.print("Enter amount of dimes:");
		int dimes = userInput.nextInt();
		
		System.out.print("Enter amount of nickels:");
		int nicks = userInput.nextInt();
		
		System.out.print("Enter amount of pennies:");
		int pens = userInput.nextInt();
		
		//Calculating the values of each coin that prepares for the sum in dollars.
		
		
		double TotalAmount = (quart * 0.25) + (dimes * 0.10) + (nicks * 0.05) + (pens * 0.01);
		
		 System.out.println("Total:" + TotalAmount);
		
		
		
	}
}
