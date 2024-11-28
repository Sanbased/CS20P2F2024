package Mastery;

import java.util.Scanner;

public class DigitExtractorMastery {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer of choice:");
		
		Numb num = new Numb(input.nextInt());
		
		String choice;
		
		while (true) {
			
			System.out.println("Display (W)hole number");
			
			System.out.println("Display (O)nes number");
			
			System.out.println("Display (T)ens number");
			
			System.out.println("Display (H)undreds number");
			
			System.out.println("(Q)uit Program");
			
			System.out.println("Please pick an option:");
			
			choice = input.next();
			
			choice = choice.toLowerCase();
			
			if (choice.equals("q")) {
				break;
			}
		
		
		switch (choice) {
		
		case "w": System.out.println("your integer is " + num.whole()); 
			break;
		
		case "o": System.out.println("The ones place digit is: " + num.ones()); 
			break;
		
		case "t": System.out.println("The tens place digit is: " + num.tens());
			break;
			
		case "h": System.out.println("The hundreds place digit is: " + num.hund());
			break;
			
			default: System.out.println("Error! you entered something invalid. Please try again.");
		
		
		
		
		}
		}
	}
	
}		