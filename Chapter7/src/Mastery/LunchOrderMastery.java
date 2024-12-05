package Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LunchOrderMastery {

	public static void main(String[] args) {
		
		int numham;
		int numsalad;
		int numff;
		int numsoda;
		
		Scanner input = new Scanner(System.in);
		
		DecimalFormat formating = new DecimalFormat("#.##");
		
		FoodInfo hamburger = new FoodInfo(1.85, 33, 9, 1);
		FoodInfo salad = new FoodInfo(2.00, 11, 1, 5);
		FoodInfo ff = new FoodInfo(1.30, 36, 11, 4);
		FoodInfo soda = new FoodInfo(0.95, 38, 0, 0);
		
		
		System.out.println("Enter number of hamburgers: ");
		numham = input.nextInt();
		System.out.println("Each hamburger has " + hamburger.GCarb() + "g of carbs, " + hamburger.GFat() + " g of fat, and " + hamburger.GFiber() + "g of fiber");
		
		System.out.println("Enter number of Salad: ");
		numsalad = input.nextInt();
		System.out.println("Each salad has " + salad.GCarb() + "g of carbs, " + salad.GFat() + " g of fat, and " + salad.GFiber() + "g of fiber");		
		
		System.out.println("Enter number of French Fries: ");
		numff= input.nextInt();
		System.out.println("Each order of French Fries has " + ff.GCarb() + "g of carbs, " + ff.GFat() + " g of fat, and " + ff.GFiber() + "g of fiber");		
		
		System.out.println("Enter number of Sodas: ");
		numsoda = input.nextInt();
		System.out.println("Each soda has " + soda.GCarb() + "g of carbs, " + soda.GFat() + " g of fat, and " + soda.GFiber() + "g of fiber");		
		
	
		System.out.println("Your order comes to: $" + formating.format(numham*hamburger.TPrice() + numsalad*salad.TPrice() + numff*ff.TPrice() + numsoda*soda.TPrice()));
		
	}
}