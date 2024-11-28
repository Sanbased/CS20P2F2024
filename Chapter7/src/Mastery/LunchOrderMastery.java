package Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LunchOrderMastery {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DecimalFormat formating = new DecimalFormat("#.##");
		
		FoodInfo foodorder = new FoodInfo();
		
		
		System.out.println("Enter number of hamburgers: ");
		
		foodorder.hamburger(input.nextInt(), 9, 33, 1);
		
		System.out.println("");
		
		
		System.out.println("Enter number of Salad: ");
		
		foodorder.salad(input.nextInt(), 1, 11, 5);
		
		System.out.println("");
		
		
		System.out.println("Enter number of French Fries: ");
		
		foodorder.FrenchFries(input.nextInt(), 11, 36, 4);
		
		System.out.println("");
		
		
		System.out.println("Enter number of Sodas: ");
		
		foodorder.Soda(input.nextInt(), 0, 38, 0);
		
		System.out.println("Your order comes to: $" + formating.format(foodorder.totalPrice()));
		
	
		
	}
}
