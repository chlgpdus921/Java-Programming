package myPackage;

public class Circle implements Shape {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle  Radius: " + radius;
	}

	@Override
	public boolean equals(Object otherObject) {
		if (!(otherObject != null && otherObject instanceof Circle))
			return false;
		Circle otherCircle = (Circle) otherObject;
		return this.radius == otherCircle.radius;
	}
}
