package Mastery;

public class FoodInfo {

	private double itemprice;
	
	public FoodInfo() {
		
		itemprice = 0;
	}
	
	public void hamburger(int burgernum, double fat, double carb, double fiber) {
		
		itemprice += (burgernum*1.85);
		
		System.out.println("Each hamburger has " + fat + "grams of fat, " + carb + "grams of carbs, and " + fiber + "grams of fiber.");
	}
	public void salad( int saladnum, double fat, double carb, double fiber) {
		
		itemprice += (saladnum*2);
		
		System.out.println("Each salad has " + fat + "grams of fat, " + carb + "grams of carbs, and " + fiber + "grams of fiber.");
	}
	
	public void FrenchFries( int Friesnum, double fat, double carb, double fiber) {
		
		itemprice += (Friesnum*1.3);
		
		System.out.println("French Fries have " + fat + "grams of fat, " + carb + "grams of carbs, and " + fiber + "grams of fiber.");
	}
	public void Soda( int sodanum, double fat, double carb, double fiber) {
		
		itemprice += (sodanum*0.95);
		
		System.out.println("Soda has " + fat + "grams of fat, " + carb + "grams of carbs, and " + fiber + "grams of fiber.");
	}
	
	public double totalPrice() {
		return itemprice;
	}
	
}
