/*

Program: ProjectMastery.java          Date: September 24th 2024

Purpose: Helps analyze the time taken for each step during coding. 


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ProjectMastery {
	public static void main(String[] args) 
	{
		//deca in decimal format, used when printing the percentage of time taken for each task (near the end of the program)
		 DecimalFormat deca = new DecimalFormat("#.##");
		 
		//Declare the integer and double variables:
		int designing = 0;
		int coding = 0;
		int debugging = 0;
		int testing = 0;
		
		double totalMinutes = 0;
		double totalDesign = 0;
		double totalCode = 0; 
		double totalDebug = 0;
		double totalTest = 0;
		
		//preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//intro message
		//Prompt user for the time taken for each task, and store the input values in the corresponding integer variable: 
		System.out.println("This program helps you calculate how much time each step of coding takes!");
		
		System.out.println("Enter the values below in minutes");
		
		System.out.println("Please enter the time spent for Designing:");
		designing += userInput.nextInt();
		
		System.out.println("Please enter the time spent for Coding:");
		coding += userInput.nextInt();
		
		System.out.println("Please enter the time spent for Debugging:");
		debugging += userInput.nextInt();
		
		System.out.println("Please enter the time spent for Testing:");
		testing += userInput.nextInt();
		
		//computation using user inputs; converting time spent into a percentage out of 100:
	    totalMinutes = designing + coding + debugging + testing;
	    
	    totalDesign = (Double.valueOf(designing) / Double.valueOf(totalMinutes))*100;
	    
	    totalCode = (Double.valueOf(coding) / Double.valueOf(totalMinutes))*100;
	    
	    totalDebug = (Double.valueOf(debugging) / Double.valueOf(totalMinutes))*100;
	    
	    totalTest = (Double.valueOf(testing) / Double.valueOf(totalMinutes))*100;
	    
	    
	    //Print the output percentages of time spent on each task:
	      System.out.println("Task		%Time");
	      System.out.println("Designing:	" + deca.format(totalDesign) + "%");
	      System.out.println("Coding:		" + deca.format(totalCode) + "%");
	      System.out.println("Debugging:  	" + deca.format(totalDebug) + "%");
	      System.out.println("Testing: 	" + deca.format(totalTest) + "%");

		
	}
}

/* Screen Dump


Test Case 1:
This program helps you calculate how much time each step of coding takes!
Enter the values below in minutes
Please enter the time spent for Designing:
83
Please enter the time spent for Coding:
92
Please enter the time spent for Debugging:
75
Please enter the time spent for Testing:
43
Task		%Time
Designing:	28.33%
Coding:		31.4%
Debugging:  25.6%
Testing: 	14.68%


Test Case 2:
 This program helps you calculate how much time each step of coding takes!
Enter the values below in minutes
Please enter the time spent for Designing:
13
Please enter the time spent for Coding:
54
Please enter the time spent for Debugging:
66
Please enter the time spent for Testing:
34
Task		%Time
Designing:	7.78%
Coding:		32.34%
Debugging:  39.52%
Testing: 	20.36%

 
 */
