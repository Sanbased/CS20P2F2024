 /*

Program: MerticConversionMastery.java        Date: Nov 1st 2024

Purpose: To convert numbers from metric to English units or vice versa

School: CHHS
Course: Computer Science 20

*/
package Mastery;

import java.util.Scanner;
import java.lang.Math;

public class MerticConversionMastery {
	public static void main(String[] args) {
		//prepare scanner for user input
	       Scanner input = new Scanner(System.in); 
	       
	      // initialize int choice
	       int choice = 0;
	       
	       //While loop until user decides to exit by choosing option 9.
	       while (choice != 9) {
	    	   
	    	   // display Menu method
	           displayMenu();
	         
	           //user input number is set at the "choice" variable
	           choice = input.nextInt();
	           
	          //if statement checks if choice is valid
	           if (choice >= 1 && choice <= 8) {
	           
	        // prompt user for conversion value
	           	System.out.print("Enter value: ");
	            
	           	
	           	// user input conversion value set as double value
	           	double value = input.nextDouble();
	              
	           	// convert method is used along with the choice, and value both entered by user
	               double result = convert(choice, value);
	              
	            //display result to the user 
	               System.out.println("Result: " + result);
	       } 
	           // if the user wants to exit and they choose option 9 
	           else if (choice ==9) {
	        	   System.out.println("Thanks for using The Program!");   
	           }
	           // if there is an error while user inputs a choice
	           else {
	        	   System.out.print("Error, please enter a valid choice. ");
	           }    
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
    System.out.println("9. Exit");
   	System.out.print("Choose an option 1-9: ");
   }

// convert method using a switch for the calculations
   public static double convert(int choice, double value) {
      
   	switch (choice) {
   	case 1: return value * 2.54; // inch to centi
   	case 2: return value / 2.54; //centi to inch
   	case 3: return value * 30.48; // feet to centi
   	case 4: return value / 30.48; // centi to feet 
   	case 5: return value * 0.9144; // yard to meter 
   	case 6: return value / 0.9114; // meter to yard
   	case 7: return value * 1.6093; // mile to kilometer
   	case 8: return value / 1.6093; // kilometer to mile
   		default: return 0; // default case
   	}
   }
}
/* Screen Dump

Test Case 1:
Metric Conversion Menu:
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters
6. meters to yards
7. miles to kilometers
8. kilometers to miles
9. Exit
Choose an option 1-9: 1
Enter value: 12
Result: 30.48
Metric Conversion Menu:
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters
6. meters to yards
7. miles to kilometers
8. kilometers to miles
9. Exit
Choose an option 1-9: 

Test Case 2:
Metric Conversion Menu:
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters
6. meters to yards
7. miles to kilometers
8. kilometers to miles
9. Exit
Choose an option 1-8: 7
Enter value: 5
Result: 8.0465
Metric Conversion Menu:
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters
6. meters to yards
7. miles to kilometers
8. kilometers to miles
9. Exit
Choose an option 1-9: 

Test Case 3:
Metric Conversion Menu:
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters
6. meters to yards
7. miles to kilometers
8. kilometers to miles
9. Exit
Choose an option 1-9: 9
Thanks for using The Program!
 */