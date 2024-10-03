 /*

Program: MathTutor.java          Date: October 1st 2024

Purpose: Displays math problems by randomly selecting 2 random numbers 1-10 and a random operator, then prompts the user for the answer!

School: CHHS
Course: Computer Science 20

*/

package Mastery;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquationsMastery {
	
	public static void main(String[] args) 
	{
	
	//Declare the variables
		double root1;
		double root2;
		
	//prepare scanner for userinput 
	Scanner userInput = new Scanner(System.in);
	
	//prompt user introduction message, explaining the program
	System.out.println("This program calculates the root(s) of any quadratic equation!");
	
	
    // Prompt the user for values of a, b, and c in the quadratic equation
    System.out.println("Enter value for a: ");
    double a = userInput.nextInt();
    
    System.out.println("Enter value for b: ");
    double b = userInput.nextInt();
    
    System.out.println("Enter value for c: ");
    double c = userInput.nextInt();
    
    // Calculating the discriminant (b^2 * 4*a*c)
    double discriminant = (b * b - 4 * a * c);
    
    // Determining if the root has 2 real solutions, one repeated solution, or two imaginary solutions
    //based on the discriminant, program outputs the roots respectively
    
    if (discriminant > 0) {
    	
        // Two real roots
        root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.printf("Discriminant is > 0, There are two real roots.\nRoot 1: %.2f\nRoot 2: %.2f\n", root1, root2);
        
    } if (discriminant == 0) {
    	
        // One real root 
        double root = -b / (2 * a);
        System.out.printf("Discriminant is = 0, There is a repeated solution (one root).\nRoot: %.2f\n", root);
        
    } else if (discriminant < 0){
    	
        // two Complex roots
        double realPart = -b / (2 * a);
        double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
        System.out.printf("Roots are complex.\nRoot 1: %.2f + %.2fi\nRoot 2: %.2f - %.2fi\n", realPart, imaginaryPart, realPart, imaginaryPart);


    }

    }
   
   
}

 
/* Screen Dump

Test Case 1:

This program calculates the root(s) of any quadratic equation!
Enter value for a: 
5
Enter value for b: 
2
Enter value for c: 
4
Roots are complex.
Root 1: -0.20 + 0.87i
Root 2: -0.20 - 0.87i



Test Case 2:

This program calculates the root(s) of any quadratic equation!
Enter value for a: 
2
Enter value for b: 
2
Enter value for c: 
-1
Discriminant is >0, There are two real roots.
Root 1: 0.37
Root 2: -1.37



Test Case 3:

This program calculates the root(s) of any quadratic equation!
Enter value for a: 
2
Enter value for b: 
4
Enter value for c: 
2
Discriminant is = 0, There is a repeated solution (one root).
Root: -1.00


 */
