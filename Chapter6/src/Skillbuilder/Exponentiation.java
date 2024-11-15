package Skillbuilder;

import java.util.Scanner;

public class Exponentiation {
	
	public static void PowerOf(int num1, int num2) {
		int ans = 1;
		
		for (int i = 1; i <= num2; i++) 
		{
			ans = num1*ans;
		}
			System.out.println(num1 + " raised to the power of " + num2 + " is: " + ans);
	
	}
	public static void main(String[] args) {
	     
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		     
		int num1, num2;
		
		// Get the base value from the user
		     
		System.out.print("Enter any number of your choice: ");
		      
		num1 = input.nextInt();
		     
		// Ask the user for the value of the exponent
		     
		System.out.print("Enter the number of the exponent: ");
		      
		      
		num2 = input.nextInt();
		     
		PowerOf(num1, num2);
		     
		
		    }

}
