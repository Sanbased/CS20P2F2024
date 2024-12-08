 /*

Program: LunchOrderMastery.java        Date: Nov 29th 2024

Purpose: let user make a lunch order with the items hamburger, salad, french fries, and soda

School: CHHS
Course: Computer Science 20

*/
package Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LunchOrderMastery {

	public static void main(String[] args) {
		
		//Declare variables used for calculating ordertotal later on in the program
		//variables store amount of each item ordered
		int numham;
		int numsalad;
		int numff;
		int numsoda;
		
		//Prepare scanner for user input
		Scanner input = new Scanner(System.in);
		
		//Decimal format used when printing order total later on in the program
		DecimalFormat formating = new DecimalFormat("#.##");
		
		//linking the food item objects from the Lunch Order class to the price, carbs, fat, and fiber amounts using the FoodInfo class
		// Ex. FoodInfo soda = new FoodInfo(price, carbs, fat, fiber);
		FoodInfo hamburger = new FoodInfo(1.85, 33, 9, 1);
		FoodInfo salad = new FoodInfo(2.00, 11, 1, 5);
		FoodInfo ff = new FoodInfo(1.30, 36, 11, 4);
		FoodInfo soda = new FoodInfo(0.95, 38, 0, 0);
		
		//Intro message welcoming users 
		System.out.println("Welcome! This program helps you make a lunch order.");
		
		//prompt user for number of hamburgers
		System.out.println("Enter number of hamburgers: ");
		//store user value in the numham variable
		numham = input.nextInt();
		//print hamburger facts3
		System.out.println("Each hamburger has " + hamburger.GCarb() + 
				"g of carbs, " + hamburger.GFat() + " g of fat, and " + hamburger.GFiber() + "g of fiber");
		
		//prompt user for number of salads
		System.out.println("Enter number of Salads: ");
		//store user value in the numsalad variable
		numsalad = input.nextInt();
		//print salad facts
		System.out.println("Each salad has " + salad.GCarb() + 
				"g of carbs, " + salad.GFat() + " g of fat, and " + salad.GFiber() + "g of fiber");		
		
		//prompt user for the number of French Fries
		System.out.println("Enter number of French Fries: ");
		//store user value in the numff variable
		numff= input.nextInt();
		//print French Fries facts
		System.out.println("Each order of French Fries has " + ff.GCarb() + 
				"g of carbs, " + ff.GFat() + " g of fat, and " + ff.GFiber() + "g of fiber");		
		
		//prompt user for the number of sodas
		System.out.println("Enter number of Sodas: ");
		//store user value in the numsoda variable
		numsoda = input.nextInt();
		//print soda facts
		System.out.println("Each soda has " + soda.GCarb() + 
				"g of carbs, " + soda.GFat() + " g of fat, and " + soda.GFiber() + "g of fiber");		
		
		//print the order total 
		//use the decimal formatting declared at the start of the program
		// multiplying number of item times the item price, then adding all of the item prices together to get order total.
		System.out.println("Your order total is: $" + formating.format(numham*hamburger.TPrice() + numsalad*salad.TPrice() + numff*ff.TPrice() + numsoda*soda.TPrice()));
		
	}
}
/* Screen Dump

Test Case 1:
Welcome! This program helps you make a lunch order.
Enter number of hamburgers: 
3
Each hamburger has 33g of carbs, 9 g of fat, and 1g of fiber
Enter number of Salads: 
2
Each salad has 11g of carbs, 1 g of fat, and 5g of fiber
Enter number of French Fries: 
5
Each order of French Fries has 36g of carbs, 11 g of fat, and 4g of fiber
Enter number of Sodas: 
4
Each soda has 38g of carbs, 0 g of fat, and 0g of fiber
Your order total is: $19.85

Test Case 2:
Welcome! This program helps you make a lunch order.
Enter number of hamburgers: 
1
Each hamburger has 33g of carbs, 9 g of fat, and 1g of fiber
Enter number of Salads: 
2
Each salad has 11g of carbs, 1 g of fat, and 5g of fiber
Enter number of French Fries: 
0
Each order of French Fries has 36g of carbs, 11 g of fat, and 4g of fiber
Enter number of Sodas: 
2
Each soda has 38g of carbs, 0 g of fat, and 0g of fiber
Your order total is: $7.75

 */