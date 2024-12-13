 /*

Program: Palindrome.java        Date: Dec 11th 2024

Purpose: Create a Palindrome application that prompts the user for a string and then displays a message
indicating whether or not the string is a palindrome.
School: CHHS
Course: Computer Science 20

*/
package Mastery;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[]args) {
		
		//Prepare scanner for user input
		Scanner input = new Scanner(System.in);
		
		//Declaring variables
		//string to store user input word/phrase
		//array to store the letters of the word/phrase
		//boolean is used when deciding if word/phrase is palindrome or not
		char[] wordletters; 
		String words;
		boolean ispalindrome = true;
		
		//Prompt User to enter a word/phrase
		System.out.println("Please enter a word or phrase:");
		
		//user input is stored in the words string, and it is set to lowercase for ease when calculating if palindrome or not
		words = input.nextLine().toLowerCase();
		
		//removes non alphabetic characters, such as spaces
		words = words.replaceAll("[^a-z]", "");

		//adding each letter of the word/phrase into an array
		wordletters = words.toCharArray();
		
		//calculation to find out if the userinput is a palindrome or not
		for (int i = 0; i < wordletters.length / 2; i++) {
			
			//compares the characters from start to end of array 
			//if a character doesn't match the reversed counterpart, it is not a palindrome. Therefore ispalindrome is set to false. 
			if (wordletters[i] != wordletters[wordletters.length - 1 - i]) {
				ispalindrome = false;
			}
		}
		//phrase is a palindrome
		if (ispalindrome == true) {
		System.out.println("The word or phrase you entered is a palindrome.");
	}
		//phrase isn't a palindrome
		else { 
		System.out.println("The word or phrase you entered is not a palindrome.");
	}
}
}
/* Screen Dump

Test Case 1:
Please enter a word or phrase:
never odd or even
The word or phrase you entered is a palindrome.

Test Case 2:
Please enter a word or phrase:
sanjeev
The word or phrase you entered is not a palindrome.


 */