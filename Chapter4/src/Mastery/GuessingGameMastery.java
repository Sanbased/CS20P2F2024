/*

Program: GuessingGame.java          Date: September 30th 2024

Purpose:

School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;
import java.util.Random;

public class GuessingGameMastery {
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

       //prompt user for a number 1-20:
       System.out.println("Please enter a integer from 1-20:");  
        UserNum = input.nextInt();

      //print the values of the computer randomly generated integer and the user input random integer
       System.out.println("Computer's Number: " + SecrectNum);
       System.out.println("User's Number: " + UserNum);

      //program checks to see if user input and randomly generated number are the same
       if (SecrectNum == UserNum) {
            System.out.println("Congrats! you won!");
       }
       else {
        System.out.println("Oops... Try Again!");
    }






    }
}

/* Screen Dump


Test Case 1:
This program will generate a random number 1-20, and you will do the same.
Your goal is to pick the same number as the program!
Please enter a integer from 1-20:
3
Computer's Number: 2
User's Number: 3
Oops... Try Again!

Test Case 2:

This program will generate a random number 1-20, and you will do the same.
Your goal is to pick the same number as the program!
Please enter a integer from 1-20:
4
Computer's Number: 4
User's Number: 4
Congrats! you won!


 */ 