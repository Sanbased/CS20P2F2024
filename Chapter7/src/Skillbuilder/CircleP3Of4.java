package Skillbuilder;

public class CircleP3Of4 {
	private double radius;
	private static final double PI = 3.14;
	
		public CircleP3Of4() { //constructor 
			radius = 1;
		}
		public CircleP3Of4(double r) { //constructor 
			radius = r;
		}
		public void setRadius(double newRadius) { //modifier method to change radius 
			radius = newRadius;
		}
		
		public double area(){ //method returns area of the circle using radius
			return(radius * radius * PI);
		}
		
		public double getRadius() { // Accessor method for radius
			 return(radius);
		}
		
		public double circumference(){ //method returns area of  circle using radius
			return(radius * 2 * PI);
		}
		
		public static void displayAreaFormula() {
			System.out.println("The formula for the area of a circle is a = Pi*r*r");
		}
}
