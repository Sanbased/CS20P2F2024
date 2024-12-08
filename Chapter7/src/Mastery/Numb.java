 /*

Program: Numb.java        Date: Dec 3rd 2024

Purpose: supports DigitExtractorMastery in calculating the ones, tens, and hundreds place values

School: CHHS
Course: Computer Science 20

*/
package Mastery;

public class Numb {

	//num variable to store user input number
		private int num;
		
	//constructor method 
	//create Numb class with the variable num which is equal to the int number (the parameter needed for the object)
		public Numb (int number) {
			num = number;
		}
		
	//method gives the whole number value
		public int whole() {
			return num;
		}
		
	//method gives the ones place value
		public int ones() {
			return num%10; // remainder of num divided by 10
		}
		
	//method gives the tens place value
		public int tens() {
			return (num/10)%10; //divide num by 10, then find remainder when divided by 10
		}
		
	//method gives the hundreds palce value	
		public int hund() {
			return (num/100)%10; //divide num by 100, then find remainder when divided by 10
		}
}
// no test case for this class. Please refer to DigitExtractorMastery class. 