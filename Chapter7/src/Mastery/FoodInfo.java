package Mastery;

public class FoodInfo {

	private double itemprice;
	private int itemcarb;
	private int itemfat;
	private int itemfiber;
	
	public FoodInfo(double price, int carbs, int fat, int fiber) {
		itemprice = price;
		itemcarb = carbs;
		itemfat = fat;
		itemfiber = fiber;
	}
	
	public double TPrice() {
		return itemprice;
	}
	
	public int GCarb() {
		return itemcarb;
	}
	
	public int GFat() {
		return itemfat;
	}
	
	public int GFiber() {
		return itemfiber;
	}
	
}
 