/*

Program: DigitsMastery.java          Date: September 19th 2024

Purpose: Displays the hundred-place, tens-place, and ones-place digits for a three-digit number.


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;

public class DigitsMastery {
	public static void main(String[] args) 
	{	
		//Declare the place value variables:
		int ones = 0;
		int tens = 0;
		int hundreds = 0;
 
		
		Scanner userInput = new Scanner(System.in);
		
		//Prompt user to enter a three digit number:
		System.out.print("Please enter a three digit number: ");

		//store the userInput in the "number" variable:
		int number = userInput.nextInt();
		
		 //system error message if an invalid input is given from user:
		if (number > 999) {
        System.out.println("\nError! Number is more then 3 digits.");
		}
        if (number < 100) {
        System.out.println("Error! Number is less then 3 digits.");
        }
        
        else if (number > 100 && number < 999) {
            
		//Compute the values:
		hundreds = (number / 100)%10;
		tens = (number / 10)%10;
		ones = (number / 1)%10;
		
		// print output for user
		System.out.println("The number " + number + " has the following place values:");
		System.out.println("Hundreds place digit: " + hundreds);
		System.out.println("Tens place digit: " + tens);
		System.out.println("Ones place digit: " + ones);
        }
	}
	
	
}

/* Screen Dump


Test Case 1:

Please enter a three digit number: 675
The number 675 has the following place values:
Hundreds place digit: 6
Tens place digit: 7
Ones place digit: 5




Test Case 2:
 
Please enter a three digit number: 867
The number 867 has the following place values:
Hundreds place digit: 8
Tens place digit: 6
Ones place digit: 7


 
 */