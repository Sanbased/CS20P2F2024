 /*

Program: MySavingsMastery.java        Date: Dec 1st 2024

Purpose: add or remove different coins from bank account

School: CHHS
Course: Computer Science 20

*/
package Mastery;

import java.util.Scanner;

public class MySavingsMastery {
	public static void main(String[] args) {
		
		//prepare scanner for user input 
		Scanner input = new Scanner(System.in);
		
		//create PiggyBank object to link the PiggyBank class to this class. 
		//we can use PiggyBank.(method name goes here) to use methods from the PiggyBank class
		PiggyBank PiggyBank = new PiggyBank();
		
		//choice variable will be used to store user input 
		//choice variable will be used in a switch statement to do the task ordered by user. 
		int choice;
		
		//while loop runs until user decides to exit with the choice 0
		while (true) {
			
			//options that the user can choose from
			System.out.println("1. Show total in bank");
			System.out.println("2. Add a penny");
			System.out.println("3. Add a nickel");
			System.out.println("4. Add a dime");
			System.out.println("5. Add a quarter");
			System.out.println("6. Take money out of the bank");
			System.out.println("Enter 0 to quit.");
			System.out.println("Enter your choice:");
			
			//user input stored in the choice variable
			choice = input.nextInt();
			
			//if choice is option 0, end program
			if (choice == 0) {
				System.out.println("Thanks for using the Application. Bye!");
				break;
			}
			
			//switch statement uses the choice variable to output the correct action based on what number user picked
			switch (choice) {
			
			//show total
			case 1:
				System.out.printf("Total in the Bank: $%.2f\n", PiggyBank.getTotal());
				break;
				
			//add penny
			case 2:
				PiggyBank.addPenny();
				System.out.println("Added a penny.");
				break;
			
			//add nickel
			case 3:
				PiggyBank.addNickel();
				System.out.println("Added a nickel.");
				break;
				
			//add dime
			case 4:
				PiggyBank.addDime();
				System.out.println("Added a dime.");
				break;
			
			//add quarter	
			case 5:
				PiggyBank.addQuarter();
				System.out.println("Added a quarter.");
				break;
			
			//take all money out of the bank
			case 6:
				PiggyBank.takeMoneyOut();
				System.out.println("All money has been removed from the bank.");
				break;
				
			//default switch statement 	
			default:
				System.out.println("Error, Please try again.");
			}
			
		} 
	
}
}
/* Screen Dump

Test Case 1:

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
4
Added a dime.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
4
Added a dime.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
3
Added a nickel.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
3
Added a nickel.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
2
Added a penny.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
2
Added a penny.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
1
Total in the Bank: $0.32
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
6
All money has been removed from the bank.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
0
Thanks for using the Application. Bye!

Test Case 2:

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
4
Added a dime.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
3
Added a nickel.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
2
Added a penny.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
1
Total in the Bank: $0.16
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
5
Added a quarter.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
6
All money has been removed from the bank.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
1
Total in the Bank: $0.00
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit.
Enter your choice:
0
Thanks for using the Application. Bye!
 */


