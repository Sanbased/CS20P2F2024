package Skillbuilder;

import java.util.Scanner;

public class TimeConverter {
	//Converts hours to minutes
		public static void hoursToMin()
		{
			//Declaration
			int hours, mins;
			
			//prepare scanner for userinput later in program
		       Scanner input = new Scanner(System.in); 
		       
			//Prompt and record user input
			System.out.println("Enter the number of hours: ");
			hours = input.nextInt();
			
			mins = hours * 60;
			
			System.out.println( "There are "+
								mins + " minutes in "+
								hours + " hours."
							);		
			
		}
		
		//Convert days to hours
		public static void daysToHours()
		{
			//Declaration
			int days, hours;
			
			//Preparing for user input
			Scanner input = new Scanner(System.in);
			
			//Prompt and record user input
			System.out.println("Enter the number of days: ");
			days = input.nextInt();
			
			//Convert days to hours
			hours = days * 24;
			
			//Output the final message to the user
			System.out.println( "There are "+
								hours + " hours in "+
								days + " days."
							);		
			
		}
		
		public static void main(String[] args) 
		{
			int choice;
			
			//Preparing for user input
			Scanner input = new Scanner(System.in);
					
			//Prompt and record user input
			System.out.println( "Please choose one of the following options: ");
			System.out.println( "1. Hours to minutes. ");
			System.out.println( "2. Days to hours. ");
			
			//Record the users choice
			choice = input.nextInt();
			
			//Let the switch statement decide which method to call
			switch(choice)
			{
				case 1:
					hoursToMin();
					break;
				case 2:
					daysToHours();
				break;
			}

		}
}


