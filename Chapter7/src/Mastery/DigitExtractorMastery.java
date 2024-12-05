 /*

Program: DigitExtractorMastery.java        Date: Dec 3rd 2024

Purpose: Create a DigitExtractor application that prompts the user for an integer and then displays the ones,
tens, and hundreds digit of the number.

School: CHHS
Course: Computer Science 20

*/
package Mastery;

import java.util.Scanner;

public class DigitExtractorMastery {

	public static void main(String[]args) {
		
		//Prepare scanner for user input 
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a number
		System.out.print("Please enter an integer of choice:");
		
		//Create a num object to store the user input, aswell as to link the Numb.java class
		//We can use num.(method name goes here) to use methods from the Numb.java class
		Numb num = new Numb(input.nextInt());
		
		//Choice string will be used to store user input letter 
		//Choice string will be used in a switch statement to do the task ordered by user. 
		String choice;
		
		//While loop runs until user quits the program
		while (true) {
			
			//Options that the user can choose
			System.out.println("Display (W)hole number");
			
			System.out.println("Display (O)nes number");
			
			System.out.println("Display (T)ens number");
			
			System.out.println("Display (H)undreds number");
			
			System.out.println("(Q)uit Program");
			
			System.out.println("Please pick an option:");
			
			//Choice variable stores user input
			//Choice set to lower case 
			choice = input.next();
			
			choice = choice.toLowerCase();
			
			//If user decides to quit (option q), program ends
			if (choice.equals("q")) {
				break;
			}
		
		//Switch statement to calculate the option picked by the user
		switch (choice) {
		
		//Whole number
		case "w": System.out.println("your integer is " + num.whole()); 
			break;
		
		//Ones place
		case "o": System.out.println("The ones place digit is: " + num.ones()); 
			break;
		
		//Tens palce
		case "t": System.out.println("The tens place digit is: " + num.tens());
			break;
		
		//Hundreds place
		case "h": System.out.println("The hundreds place digit is: " + num.hund());
			break;
			
		//Default switch statement	
		default: System.out.println("Error! you entered something invalid. Please try again.");
		
		
		
		
		}
		}
	}
	
}		
/* Screen Dump

Test Case 1:
Please enter an integer of choice:3
Display (W)hole number
Display (O)nes number
Display (T)ens number
Display (H)undreds number
(Q)uit Program
Please pick an option:
o
The ones place digit is: 3
Display (W)hole number
Display (O)nes number
Display (T)ens number
Display (H)undreds number
(Q)uit Program
Please pick an option:
q

Test Case 2:
Please enter an integer of choice:876
Display (W)hole number
Display (O)nes number
Display (T)ens number
Display (H)undreds number
(Q)uit Program
Please pick an option:
t
The tens place digit is: 7
Display (W)hole number
Display (O)nes number
Display (T)ens number
Display (H)undreds number
(Q)uit Program
Please pick an option:
q

 */