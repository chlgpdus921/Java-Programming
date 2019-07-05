package myPackage;

public class RightTriangle extends Shape{
	private double height;
	private double width;
	RightTriangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		return (height * width)/2;
	}

	@Override
	public String toString() {
		return "RightTriangle  Height: "+ height+"  Width: "+ width;	
	}

	@Override
	public boolean equals(Object otherObject) {
		if (!(otherObject != null && otherObject instanceof RightTriangle))
			return false;
		RightTriangle r = (RightTriangle) otherObject;
		return this.height == r.height && this.width == r.width;
	}

}
