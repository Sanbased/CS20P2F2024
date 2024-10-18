 /*

Program: GroupAssignment.java          Date: October 16th 2024

Purpose: selects group based on last name

School: CHHS
Course: Computer Science 20

*/
package Mastery;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) 
	{
		//Declare the variables
		String Fname;
		String Lname;
		char Letter1;
		int groupNumber;
		
		//prepare scanner for userinput later in program
	       Scanner input = new Scanner(System.in);
		
	   //prompt user intro message
	       System.out.println("This program will assign you a group based on your name!");
	       
	   //prompt user for first and last name
	       System.out.println("please enter your first name:");
	       Fname = input.next();
	       
	       System.out.println("please enter your Last name:");
	       Lname = input.next();

	   //pull out the first letter of the last name
	       Letter1 = Character.toUpperCase(Lname.charAt(0));
	      
	   //conditional statement decides which group number the letter fits into
	       if (Letter1 >= 'A' && Letter1 <= 'I')
	            groupNumber = 1;
	       
	       else if (Letter1  >= 'J' && Letter1  <= 'S')
	            groupNumber = 2;
	      
	       else if (Letter1  >= 'T' && Letter1  <= 'Z')
	            groupNumber = 3;
	       
	       else 
	    	   
		// Invalid last name
			groupNumber = -1;
	       
	    // Display the final result
	       if (groupNumber != -1)
	         System.out.println(Fname + " " + Lname +" is assigned to group: " + groupNumber);
	       
	       	else
	       		System.out.println("Invalid last name provided.");
	       
  }
}


/* Screen Dump

Test Case 1:
This program will assign you a group based on your name!
please enter your first name:
mrs
please enter your Last name:
smith
mrs smith is assigned to group: 2

Test Case 2:
This program will assign you a group based on your name!
please enter your first name:
sanjeev
please enter your Last name:
tiwari
sanjeev tiwari is assigned to group: 3

 */

