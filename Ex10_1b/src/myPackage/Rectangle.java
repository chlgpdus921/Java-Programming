package myPackage;

public class Rectangle implements Shape {
	private double height;
	private double width;

	Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		return height * width;
	}

	@Override
	public String toString() {
		return "Rectangle  Height: "+ height+"  Width: "+ width;	
	}

	@Override
	public boolean equals(Object otherObject) {
		if (!(otherObject != null && otherObject instanceof Rectangle))
			return false;
		Rectangle otherRectangle = (Rectangle) otherObject;
		return this.height == otherRectangle.height && this.width == otherRectangle.width;
	}
}
