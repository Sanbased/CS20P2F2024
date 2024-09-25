/*

Program: ElectionMastery.java          Date: September 25th 2024

Purpose: calculate the percentage of vote for each candidate, as well as the total vote


School: CHHS
Course: Computer Science 20
 
*/


package Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ElectionMastery {
	public static void main(String[] args) 
	{
		//Declare the variables that will be used in the program
		int Awbrey = 0;
		int Martinez = 0;
		int totalvote = 0;
	
		//deca in decimal format, used when printing the percentage of vote:
		 DecimalFormat deca = new DecimalFormat("#.##");
		
		//preparing for user input
				Scanner userInput = new Scanner(System.in);
				
			// print introduction messages
				System.out.println("Please enter the number of votes casted for each candidate in each city");
				
				//collect user input and store in the appropriate variable
						
				System.out.println("Election results for New York:");
				
				System.out.println("Awbrey:");
						Awbrey+= userInput.nextInt();
				
				System.out.println("Martinez:");
						Martinez+= userInput.nextInt();
						
				System.out.println("Election results for New Jersey:");
						
				System.out.println("Awbrey:");
						Awbrey += userInput.nextInt();
						
				System.out.println("Martinez:");
						Martinez+= userInput.nextInt();
						
				System.out.println("Election results for Connecitcut:");
	
				System.out.println("Awbrey:");
						Awbrey += userInput.nextInt();
				
				System.out.println("Martinez:");
						Martinez+= userInput.nextInt();

						//Calculate the total votes casted:
						totalvote = Awbrey+Martinez;
						
						// calculate the percentage of votes casted for each person:
						  double AwbreyT = (Double.valueOf(Awbrey) / Double.valueOf(totalvote))*100;
						  
						  double MartinezT = (Double.valueOf(Martinez) / Double.valueOf(totalvote))*100;
						  
						//print output values that were calculated above:
						  System.out.println("Candidate       Votes     Percentage");
						  
						  System.out.println("Awbrey         " + Awbrey   + "     " + deca.format(AwbreyT) + "%" );
						  
						  System.out.println("Martinez       " + Martinez + "     " + deca.format(MartinezT) + "%" );
						  
						  System.out.println("TOTAL VOTES:   " + totalvote);
  
						  
										
		
	}
}

/* Screen Dump


Test Case 1:

Please enter the number of votes casted for each candidate in each city
Election results for New York:
Awbrey:
550439
Martinez:
853902
Election results for New Jersey:
Awbrey:
4935803
Martinez:
48353908
Election results for Connecitcut:
Awbrey:
934823423
Martinez:
45839048
Candidate 	Votes 	Percentage
Awbrey         940309665 	90.82%
Martinez        95046858 	9.18%
TOTAL VOTES:  1035356523

Test Case 2:

Please enter the number of votes casted for each candidate in each city
Election results for New York:
Awbrey:
93842908
Martinez:
38402898
Election results for New Jersey:
Awbrey:
87891268
Martinez:
93834753
Election results for Connecitcut:
Awbrey:
09872896
Martinez:
45378978
Candidate 	Votes 	Percentage
Awbrey         191607072 	51.89%
Martinez        177616629 	48.11%
TOTAL VOTES:  369223701

 */
