package Skillbuilder;

import java.util.Scanner;
import java.util.Random; 

public class RandomNum {

	public static void main(String[] args) 
	{ 

    //prepare scanner for userinputs
    Scanner input = new Scanner(System.in);

    //Declare the variables
    int min;
    int max;
    int RandomNum;

    //prompt user intro message
    System.out.println("This program will generate a random number based on the min and max number values you enter!");

    //prompt user for min and max values
    System.out.print("Enter the minimum number: ");
        min = input.nextInt();
    System.out.print("Enter the maximum number: ");
        max = input.nextInt();

    //Compute a random number based on the given min and max values
    Random random = new Random();
        RandomNum = random.nextInt((max - min) + 1) + min;

    // output the final message to the user, displaying the min, max, and randomly generated number
    System.out.println("The random number generated between " + min + " and " + max + " is: " + RandomNum);

    }
}	
	

