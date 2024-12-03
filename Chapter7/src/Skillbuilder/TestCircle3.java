package Skillbuilder;

public class TestCircle3 {

	public static void main(String[] args) {
		
		//creating two new circle object uses overloaded constructor method
		CircleP3Of4 spot = new CircleP3Of4();
		CircleP3Of4 spot1 = new CircleP3Of4(3);
		
		//setting first circle objects radius to new radius
		spot.setRadius(6);
		
		//outputting area and circumference of both circle objects
		System.out.println("Circle radius: " + spot.area());
		System.out.println("Circle circumference: " + spot.circumference());
		
		System.out.println("Circle radius: " + spot1.area());
		System.out.println("Circle circumference: " + spot1.circumference());
		
		//outputting formula for the area of circle using class method
		CircleP3Of4.displayAreaFormula();

	}
	
}
