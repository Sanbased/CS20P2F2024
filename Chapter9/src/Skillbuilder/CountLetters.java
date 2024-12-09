package Skillbuilder;

import java.util.Scanner;

public class CountLetters {
	public static void main(String[] args) {
	       
		Scanner input = new Scanner(System.in);  
		
		System.out.print("Please enter a phrase or word: ");
        String phrase = input.nextLine(); 

       
        int[] letterCount = new int[26]; 

   
        phrase = phrase.toLowerCase();


        for (int i = 0; i < phrase.length(); i++) {
            char currentChar = phrase.charAt(i);

           
            if (currentChar >= 'a' && currentChar <= 'z') {   
                letterCount[currentChar - 'a']++;
            }
        }

      
        System.out.println("Letter counts:");
        for (int i = 0; i < letterCount.length; i++) {
            if (letterCount[i] > 0) 
                System.out.println((char) (i + 'a') + ": " + letterCount[i]);
            }
        }
}
