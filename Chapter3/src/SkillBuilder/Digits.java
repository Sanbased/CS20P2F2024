package SkillBuilder;

import java.util.Scanner;


public class Digits {
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);

		
		//Declare the place value variables:
		int tens = 0;
		int ones = 0;
		
		//Prompt user:
		System.out.print("Please enter a two digit number: ");

		//Declare the userinput 
		int number = userInput.nextInt();
		
		//Compute the values
		tens = (number/10);
		ones = number - (tens * 10);
		
		// print output for user
		System.out.println("The number " + number + " has the following place values:");
		System.out.println("Ones place digit: " + ones);
		System.out.println("Tens place digit: " + tens);
		

		
	}
}
