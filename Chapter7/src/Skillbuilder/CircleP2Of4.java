package Skillbuilder;

public class CircleP2Of4 {

	private double radius;
	private static final double PI = 3.14;
	
	public CircleP2Of4() { //constructor
		radius = 1;
	}
	
	public CircleP2Of4(double r) { //constructor
		radius = r;
	}
	
	public void setRadius(double newRadius) { //modifier changing radius of circle object
		radius = newRadius;
	}
	
	public double area(){ //method returns area of circle using radius
		return(radius * radius * PI);
	}
	
	public double getRadius() { // Accessor method for radius
		 return(radius);
	}
	
	public double circumference(){ //method returns area of circle object using radius
		return(radius * 2 * PI);
	}
	
	
}
