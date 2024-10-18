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
		SecrectNum = random.nextInt (20) +1; 

		
		//prompt for userinput
		System.out.println("Please enter a integer from 1-20:");  
		UserNum = input.nextInt();
		
		//if computer num = user num, crongrats message is displated
		if (SecrectNum == UserNum) {
		System.out.println("Congrats! you won!");
		}
		
		//else includes while loop: when computer number isnt = to user number, do the following:
		else {
		while (SecrectNum != UserNum) {
			
			
			System.out.println("Oops... Try Again!");
			
			//prompt user again
			System.out.println("Please enter a integer from 1-20:");  
			UserNum = input.nextInt();
			
			//if user guesses right congrats message is shown and program ends
			if (SecrectNum == UserNum) {
				System.out.println("Congrats! you won!");
				}
		}
		}
		
	}
}
		
/* Screen Dump

Test Case 1:

This program will generate a random number 1-20, and you will do the same.
Your goal is to pick the same number as the program!
Please enter a integer from 1-20:
11
Oops... Try Again!
Please enter a integer from 1-20:
12
Oops... Try Again!
Please enter a integer from 1-20:
13
Oops... Try Again!
Please enter a integer from 1-20:
14
Congrats! you won!


Test Case 2:

This program will generate a random number 1-20, and you will do the same.
Your goal is to pick the same number as the program!
Please enter a integer from 1-20:
2
Congrats! you won!

 */