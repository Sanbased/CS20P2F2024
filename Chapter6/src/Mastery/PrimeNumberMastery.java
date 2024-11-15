package Mastery;

import java.util.Scanner;

public class PrimeNumberMastery {
public static void main(String[] args) {
		
	  Scanner input = new Scanner(System.in); 
		
		  System.out.print("Welcome! Please enter any number of your choice: ");
	     
		  int num = input.nextInt();
		
		  // Start assuming it's prime if > 1 using boolean function
	  
		  boolean isPrime = a(num);
	     for (int i = 2; i * i <= num; i++) {
	   
	     if (num % i == 0) {
	    // Finding a divisor
	  
	    isPrime = false;
	    
	      
	       //Ends the code once number is stored and calculated if its prime or not.
	    
	    	break;
	            }
	        }
	    
	     //Tells the user if the given number is prime or not.
	      System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
	    
	      System.out.println("Thank you!");
	}
}