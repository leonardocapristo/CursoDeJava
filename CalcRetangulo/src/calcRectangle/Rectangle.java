package calcRectangle;

public class Rectangle {

	public double widht;
	public double height;
	
	
	public double area(double widht, double height) {
		double resultArea = widht * height;
		return resultArea;
	}
	
	public double perimeter(double widht, double height) {
		
		double resultPerimeter = 2 + (widht * height);
		return resultPerimeter;
		
	}
	
	public double diagonal(double widht, double height) {
		
		double resultDiagonal = (widht*widht) + (height*height);
		return resultDiagonal;
	}
}
