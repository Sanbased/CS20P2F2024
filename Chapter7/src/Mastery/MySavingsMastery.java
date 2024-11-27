package Mastery;

import java.util.Scanner;

public class MySavingsMastery {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		PiggyBank PiggyBank = new PiggyBank();
		
		int choice;
		
		do {
			
			System.out.println("1. Show total in bank");
			System.out.println("2. Add a penny");
			System.out.println("3. Add a nickel");
			System.out.println("4. Add a dime");
			System.out.println("5. Add a quarter");
			System.out.println("6. Take money out of the bank");
			System.out.println("Enter 0 to quit.");
			System.out.println("Enter your choice:");
			choice = input.nextInt();
			
			
			switch (choice) {
			
			case 1:
				PiggyBank.showTotal();
				break;
				
			case 2:
				PiggyBank.addPenny();
				System.out.println("Added a penny.");
				break;
				
			case 3:
				PiggyBank.addNickel();
				System.out.println("Added a nickel.");
				break;
				
			case 4:
				PiggyBank.addDime();
				System.out.println("Added a dime.");
				break;
				
			case 5:
				PiggyBank.addQuarter();
				System.out.println("Added a quarter.");
				break;
				
			case 6:
				PiggyBank.takeMoneyOut();
				System.out.println("All money has been removed from the bank.");
				break;
				
			case 0:
				System.out.println("Thanks for using the Application. Bye!");
				break;
				
			default:
				System.out.println("Error, Please try again.");
				
			
			}
			
		} while (choice != 0);
		
		input.close();
	}
	
}



