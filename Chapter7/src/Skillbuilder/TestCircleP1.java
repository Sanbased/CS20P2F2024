package Skillbuilder;

public class TestCircleP1 {
	public static void main(String[] args) {
		//creating circle object
		CircleP1Of4 spot = new CircleP1Of4();
		//changing radius of circle object and outputting its area and circumference
		spot.setRadius(6);
		System.out.println("Circle radius: " + spot.area());
		System.out.println("Circle circumference: " + spot.circumference());
	}
}