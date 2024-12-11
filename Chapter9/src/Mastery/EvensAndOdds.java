 /*

Program: EvensAndOdds.java        Date: Dec 10th 2024

Purpose: Create an EvensAndOdds application that generates 25 random integers between 0 and 99 and then
displays all the evens on one line and all the odds on the next line.
School: CHHS
Course: Computer Science 20

*/
package Mastery;

public class EvensAndOdds {
	public static void main(String[] args) {
		
	//creating array to store 25 random numbers 
		int[] nums = new int[25];
		
		// setting the min and max limit for the random nums
		// setting range inside the min of 1, and max of 100
		final int minimum = 0;
		final int maximum = 99;
		final int RangeNums = maximum - minimum +1;
		
		//generating the 25 random numbers from range 1-100
		// assigning the 25 nums into the array
		for (int i = 0; i<25; i++) {
			nums [i] = (int) (Math.random() * RangeNums);
		}
		
		//print even nums
		//if statement checks to see which of the nums in the array are even, by making sure there is no remanider
		System.out.println("Even Numbers: ");
		for ( int i = 0; i<25; i++) {
			if ((nums[i] % 2 ) == 0) {
				System.out.print( nums[i]+ " ");
				System.out.print("");
			}
		}
		
		System.out.println("");
		//print odd nums
		////if statement checks to see which of the nums in the array are odd, by making sure the remainder is a number other than 0.
		System.out.println("Odd Numbers: ");
		for ( int i = 0; i<25; i++) {
			if ((nums[i] % 2 ) != 0) {
				System.out.print(nums[i]+ " ");
				System.out.print("");
			}
		}
	}
}
/* Screen Dump

Test Case 1:
Even Numbers: 
74 12 0 38 32 42 44 26 72 18 14 68 94 24 
Odd Numbers: 
11 1 69 93 39 13 39 9 87 7 83 

 */
