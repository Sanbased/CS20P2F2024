/*

Program: Cubesum.java          Date: September 23rd 2024

Purpose: Create a program that 


School: CHHS
Course: Computer Science 20
 
*/

package Skillbuilder;

import java.util.Scanner;

public class CubeSum {

	public static void main(String[] args) 
	{
		
		//Declaration
		int number;
		int digit = 0;
		int sumOfCubes = 0;

		//preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.println("Enter a positive Integer:");
		number =  input.nextInt();
		
		//Calculate the sum of digits
		do
		{
			digit = number % 10; //Remainder number
			sumOfCubes = sumOfCubes + digit*digit*digit;
			number = number/10; //Quotient number 
			
		}while(number !=0);
		
		System.out.println("The sum of the digits is:" + sumOfCubes);
		
	}
	
}

/* Screen Dump


Test Case 1:

Enter a positive Integer:
4
The sum of the digits is:64


Test Case 2:
 
3
The sum of the digits is:27

 
 */