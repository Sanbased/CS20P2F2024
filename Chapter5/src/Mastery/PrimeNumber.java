 /*

Program: PrimeNumber.java          Date: October 8th 2024

Purpose: decides if entered number is prime or not

School: CHHS
Course: Computer Science 20

*/

package Mastery;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		//Declare the variables
		int user;
		boolean n;
		int i;
		
		//prepare scanner for userinput later in program
	       Scanner input = new Scanner(System.in);
		
	    //prompt user intro message
	       System.out.println("This program will decide if the number you enter is a prime number or not.");
		
	       //prompt user for integer
	       System.out.println("please enter an integer:");
	       user = input.nextInt();
	       
	       //boolean value n is set to false
	      n = false;
	       
	       //0 and 1 aren't prime numbers
	       if (user == 0 || user == 1) {
	    	   
	    	  n = true; 
	    	   
	       }
	       
	       for ( i = 2; i<= user/2; ++i ) {
	    	   
	    	   //conditional statement for non-prime numbers:
	    	   if (user % i == 0) {
	    		   
	    		   n = true;
	    		   break;
	    	   }
	       }
	       
	       
	       //if number is divisible, it isn't a prime number, and if number is divisible, it is a prime number
	       if (!n) {
	    	   
	    	   System.out.println( user + " is a Prime Number");
	       }
	       
	       else {
	    	   
	    	   System.out.println( user + " is NOT a Prime Number");
	       }
	    	   
	}
	
}
	
/* Screen Dump

Test Case 1:
This program will decide if the number you enter is a prime number or not.
please enter an integer: 
2
2 is a Prime Number


Test Case 2:
This program will decide if the number you enter is a prime number or not.
please enter an integer:
16
16 is NOT a Prime Number

 */
