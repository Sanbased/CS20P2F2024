 /*

Program: FoodInfo.java        Date: Nov 30th 2024

Purpose: this class supports Lunch Order Mastery to get the following values: Price, carbs, fat, and fiber.

School: CHHS
Course: Computer Science 20

*/
package Mastery;

public class FoodInfo {
	
	// declaring variables to store the price, carbs, fat, and fiber amounts for items
	private double itemprice;
	private int itemcarb;
	private int itemfat;
	private int itemfiber;
	
	//constructor method with parameters price, carbs, fat, and fiber
	//initialize the variables above
	public FoodInfo(double price, int carbs, int fat, int fiber) {
		itemprice = price;
		itemcarb = carbs;
		itemfat = fat;
		itemfiber = fiber;
	}
	
	// method gives the price of item
	public double TPrice() {
		return itemprice;
	}
	
	//method gives amount of carbs for the item
	public int GCarb() {
		return itemcarb;
	}
	
	//method gives amount of fat for the item
	public int GFat() {
		return itemfat;
	}
	
	//method gives amount of fiber for the item
	public int GFiber() {
		return itemfiber;
	}
}

 // there is no test case for this class, refer to lunchorder class.