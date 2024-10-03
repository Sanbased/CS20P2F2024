 /*

Program: MathTutor.java          Date: September 30th 2024

Purpose: Displays math problems by randomly selecting 2 random numbers 1-10 and a random operator, then prompts the user for the answer!

School: CHHS
Course: Computer Science 20

*/

package Mastery;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class MathTutorMastery {

	public static void main(String[] args) 
	{

        //Prompt user intro message
        System.out.println("This program will generate 2 random numbers and use an operator on them, and its your job to answer the correct number!");
        
       //prepare scanner for userinputs later in program
       Scanner input = new Scanner(System.in);

       //Create an instance of Random class
       Random random = new Random();

        // declare variables to store random values, and generate random integers in range 1 to 10
         int rand_int1 = random.nextInt(10) +1;
         int rand_int2 = random.nextInt(10) +1;
          
         //generate a random operator 
         //Int randomoperator is declared to later create 4 cases which hold the different operators
         //Character operator is assigned an empty value 
         int Randomoperator = random.nextInt(4) +1; 
            char operator = ' ';


         //using case to select a random operator, and for each case there is a final answer calculation
         int FinalAns = 0;

         switch (Randomoperator) {

	     case 1: operator = '+';
            FinalAns = (rand_int1 + rand_int2);
		    break;
	     case 2: operator = '-';
            FinalAns = (rand_int1 - rand_int2);
            break;
         case 3: operator = '/';
            FinalAns = (rand_int1 / rand_int2);
            break;
         case 4: operator = '*';
            FinalAns = (rand_int1 * rand_int2);
		    break;
            default:
                System.out.println("Error, an invalid operator was generated.");
                return;

         }
         
         //ask for userinput and store value in a integer 
            System.out.println("What is " + rand_int1 + operator + rand_int2 +" ?");
            int UserAns = input.nextInt();

         //If statement to decide wether or not the user input the correct answer
            if (FinalAns == UserAns){
              System.out.println("You answered correctly!");
             }
              else {
                System.out.println("You answered incorrectly! The correct answer was " + FinalAns);
             }
            
        
    }
    
	
}

/* Screen Dump

Test Case 1:

This program will generate 2 random numbers and use an operator on them, and its your job to answer the correct number!
What is 6*9 ?
54
You answered correctly!


Test Case 2:

This program will generate 2 random numbers and use an operator on them, and its your job to answer the correct number!
What is 10+7 ?
13
You answered incorrectly! The correct answer was 17

 */
