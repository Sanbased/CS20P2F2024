package Skillbuilder;

public class RectangleP1of5 {

	private double length, width;
	//creating two constructor method one overloaded with parameters other without
	public RectangleP1of5(){
		length = 1;
		width = 1;
	}
	//has to enter length and width and parameters
	public RectangleP1of5(double l, double w){
		length = l;
		width = w;
	}
	//returns length of rectangle
	public double getLength() {
		return(length);
	}
	//returns width of rectangle
	public double getWidth() {
		return(width);
	}
	//setting new length for rectangle by entering a parameter for new length
	public void setLength(double l) {
		length = l;
	}
	//setting new width for rectangle by entering a parameter for new length
	public void setWidth(double w) {
		width = w;
	}
	//returns area of circle with current length and width
	public double area() {
		return(length * width);
	}
	//returns perimeter of rectangle with current length and width
	public double perimeter() {
		return(2 * (length + width));
	}
}
