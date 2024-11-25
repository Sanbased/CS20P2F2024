 /*

Program: PrimeNumberMastery.java        Date: October 24th 2024

Purpose: figures out if a number is prime or not

School: CHHS
Course: Computer Science 20

*/
package Mastery;

import java.util.Scanner;

public class PrimeNumberMastery {
	public static void main(String[] args) {
			
		  //intro message explaining the use of the program, and prompting user for input
		  	  System.out.println("Welcome! This program will decide if a number you enter is Prime or not.");
			  System.out.println("Please enter any number of your choice: ");
		     
			// set scanner for user input
			  Scanner input = new Scanner(System.in);
			  
			  // set the input as an int
			  int num = input.nextInt();
			  
			//print statement to tell the user if  the given number is prime or not.
			  // directly added the method into the print statement
			  //if isPrime is true, "is prime number" will print.
			  //if isPrime is false, "is not prime" will print. 
		      System.out.println(num + (isPrime(num)? " is a prime number." : " is not a prime number."));
		    
		      System.out.println("Thank you!");
	}
	//method to check if user input number is prime or not
public static boolean isPrime (int num) {
	
	    //for loop checks through possible divisors 
	for (int i = 2; i * i <= num; i++) {
	   
	     if (num % i == 0) {
	
	    	return false; //divisor was found, number isn't prime
	    
	            }
	}
	     if (num <=1){   //a Number equal to 1 is not prime, and a number less than 0 isn't prime.
		    return false;
		    
	     }
	     return true;   //If number is greater than 1 and there aren't any divisors, it is a prime number. 
	}
}
/* Screen Dump

Test Case 1:
Welcome! This program will decide if a number you enter is Prime or not.
Please enter any number of your choice: 
3
3 is a prime number.
Thank you!

Test Case 2:
Welcome! This program will decide if a number you enter is Prime or not.
Please enter any number of your choice: 
6
6 is not a prime number.
Thank you!

 */

