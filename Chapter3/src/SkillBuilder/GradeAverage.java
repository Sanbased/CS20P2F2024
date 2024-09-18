package SkillBuilder;

import java.util.Scanner;

public class GradeAverage {
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		//Prompt User intro message:
		System.out.println("This program will calculate the average of 5 given grades!");
       
		//Declare variable average
		int average = 0;
		
		//Prompr user, then declare input values as part of the variable "average" by adding them together
		System.out.println("grade 1: ");
		average+= userInput.nextInt();

		
		System.out.println("grade 2: ");
	    average+= userInput.nextInt();

		
		System.out.println("grade 3: ");
		 average+= userInput.nextInt(); 

		
		System.out.println("grade 4: ");
		 average+= userInput.nextInt();

		
		System.out.println("grade 5: ");
		 average+= userInput.nextInt();

	    //The average variable holds the sum of all of the userinputs, so now, it is dividing by 5
	    average /= 5;
	    
	    //show user the final average
		System.out.println("The average of the grades you entered is %" + average);

		
	

	}
}
