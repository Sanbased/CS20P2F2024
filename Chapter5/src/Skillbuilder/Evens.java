package Skillbuilder;

import java.util.Scanner;

public class Evens {

	public static void main(String[] args) 
	{
		
	    
	    //prepare scanner for userinputs later in program
	       Scanner input = new Scanner(System.in);

		//declare the variable
	      int num;
	       
		//prompt user intro message
	       System.out.println("This program will decide if the number you enter is even or odd.");
		
		 
		 //prompt user for number value
	       System.out.println("Please enter a number 1 through 20:");
	       		num = input.nextInt();
		 
	       		
	       		//if statement to decide if number is even or odd
	       		//if num is divisible by 2, it prints even, else is odd.
		 if (num % 2 == 0) {
			 	System.out.println("Even Number");
		 }
			 	else {
				 	System.out.println("Odd Number");
		 }
	}
}
