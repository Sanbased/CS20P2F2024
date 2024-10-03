package Skillbuilder;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) 
	{	
     //Declare variables
     int Height;
     int Width;
     int Length;

     //Prompt user the intro message
     System.out.println("This program will ask you for the Length, Width, and Height of a package.");
     System.out.println("The program will then decide if the package is accepted or rejected based on the dimensions!");

     //prepare scanner for user input
     Scanner userInput = new Scanner(System.in);
     
     //prompt user to enter the length, width, and height of the package, then store the values in the appropirate integer variables
        System.out.println("Please enter the Length of the box:");
            Length = userInput.nextInt();

        System.out.println("Please enter the Width of the box:");
            Width = userInput.nextInt();

        System.out.println("Please enter the Height of the box:");
            Height = userInput.nextInt();

     // if  statements for the program to decide if the dimensions are all under 10
     // if  all values are 10 or under, package is accepted, if even a single value is over 10, package is rejected

     if (Length > 10 || Width > 10 || Height > 10){ 
        System.out.println("Package is Rejected");
     } else {
            System.out.println("Package is Accepted");
        }

    }
	
}
