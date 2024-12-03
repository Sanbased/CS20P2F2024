package Skillbuilder;

public class TestCircleP2 {
	public static void main(String[] args) {

		//creating two circle objects using overloaded constructor method
		CircleP2Of4 spot = new CircleP2Of4();
		
		CircleP2Of4 spot1 = new CircleP2Of4(3);
		
		//making first circle objects' radius to the new radius
		spot.setRadius(6);
		
		//printing area and circumference of both circles
		System.out.println("Circle radius: " + spot.area());
		System.out.println("Circle circumference: " + spot.circumference());
		
		System.out.println("Circle radius: " + spot1.area());
		System.out.println("Circle circumference: " + spot1.circumference());
	}
}
