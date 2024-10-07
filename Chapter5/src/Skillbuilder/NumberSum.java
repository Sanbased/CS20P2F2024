package Skillbuilder;

import java.util.Scanner;

public class NumberSum {

	public static void main(String[] args) 
	{
	
		//Declare the variable
		int num;
		int sum = 0;
		int number;
		
		//prepare scanner for userinput later in program
	       Scanner input = new Scanner(System.in);
	       
	     //prompt user intro message
	       System.out.println("This program will display 1-(the number you input), and the sum of all the numbers.");
	       
	       
	     //prompt user for integer
	       System.out.println("please enter an integer");
	       num = input.nextInt();

	       //output message
			System.out.println("Numbers from 1 to " + num + ":");
			
			
		// for loop prints all numbers between 1 and input number
			for (number = 1; number <= num; number++) {
		          
				System.out.println(number);
				
				sum = sum+number;
			}
			
		//Display the total sum
			System.out.println("The sum is " + (sum));
		}
	}

