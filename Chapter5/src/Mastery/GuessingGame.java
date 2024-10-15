 /*

Program: GuessingGame.java          Date: October 9th 2024

Purpose:
School: CHHS
Course: Computer Science 20

*/

package Mastery;

import java.util.Random;
import java.util.Scanner;


public class GuessingGame {

	public static void main(String[] args) 
	{
		//Declare the variables that will be used in the program
				int SecrectNum = 0;
				int UserNum = 0;
			
		//Prompt user intro message
		System.out.println("This program will generate a random number 1-20, and you will do the same.");
		System.out.println("Your goal is to pick the same number as the program!");

		// prepare scanner for userinputs later in program
		Scanner input = new Scanner(System.in);

		//Create an instance of Random class
		Random random = new Random();
		
		// variable stores the random value, and generates a random integer in range 1 to 20
		SecrectNum = random.nextInt(20) +1; 

		
		//program checks to see if user input and randomly generated number are the same
		System.out.println("Please enter a integer from 1-20:");  
		UserNum = input.nextInt();
		
		
		
		//Error Statement
		 while (UserNum < 1 || UserNum > 20) {
            System.out.println("Invalid input"); 
            break;
		 }
		 
		while (SecrectNum != UserNum) {
        
			
			//print the values of the computer randomly generated integer and the user input random integer
			System.out.println("Computer's Number: " + SecrectNum);
			System.out.println("User's Number: " + UserNum);
			System.out.println("Oops... Try Again!");
			
			System.out.println("Please enter a integer from 1-20:");  
			UserNum = input.nextInt();
			
		}
		
		System.out.println("Congrats! you won!");
		
	}
}
		
/* Screen Dump

Test Case 1:


Test Case 2:


 */