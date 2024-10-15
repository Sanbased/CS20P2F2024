package Skillbuilder;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) 
	{
		//Declare the variables
				int number;
				int sum = 0;
				int user;
				
		//prepare scanner for userinput later in program
	       Scanner input = new Scanner(System.in);
		
	       
	    //prompt user intro message
	       System.out.println("This program will display all of the odd numbers between 1-(the number you input), and the sum of all the numbers.");
	
	    //prompt user for integer
	       System.out.println("please enter an integer");
	       user = input.nextInt();

	    //output message
			System.out.println("Odd numbers from 1 to " + user + ":");
	
			// for loop prints all odd numbers between 1 and input number
						for (number = 1; number <= user; number+=2) {
					          
							System.out.println(number);
							
							sum = sum+number;
						}
						
					//Display the total sum of odd nums
						System.out.println("The sum of all of the odd numbers: " + (sum));
			
	}
}
