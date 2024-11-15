package Mastery;

import java.util.Scanner;

public class MerticConversionMastery {
	public static void main(String[] args) {
	       Scanner input = new Scanner(System.in); 
	       
	       // Conversion calculations based on user input.
	  
	       int choice = 0;
	       while (choice != 9) {
	           displayMenu();
	         
	           choice = input.nextInt();
	          
	           if (choice >= 1 && choice <= 8)
	           
	           	System.out.print("Enter value: ");
	             
	           	double value = input.nextDouble();
	              
	               double result = convert(choice, value);
	              
	               System.out.println("Result: " + result);
	             
	               break;
	       }
}

public static void displayMenu() {
    
   	// Program prompts the user for which conversion they wish to choose. 
   	
   	System.out.println("Metric Conversion Menu:");
     
   	System.out.println("1. inches to centimeters");
     
   	System.out.println("2. centimeters to inches");
     
   	System.out.println("3. feet to centimeters");
    
   	System.out.println("4. centimeters to feet");
     
   	System.out.println("5. yards to meters");
     
   	System.out.println("6. meters to yards");
      
   	System.out.println("7. miles to kilometers");
     
   	System.out.println("8. kilometers to miles");
     
   	System.out.print("Choose an option 1-8: ");
   }
   public static double convert(int choice, double value) {
      
   	double[] conversions = {2.54, 1 / 2.54, 30.48, 1 / 30.48, 0.9144, 1 / 0.9144, 1.6093, 1 / 1.6093};
      
       return value * conversions[choice - 1];
   }
}

