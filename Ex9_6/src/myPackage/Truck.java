package myPackage;

public class Truck extends Vehicle {
	private double loadCapacity;
	private double towingCapacity;

	public Truck(String manufacturerName, int cylinderNumber, Person owner) {
		super(manufacturerName, cylinderNumber, owner);
		loadCapacity = 0;
		towingCapacity = 0;
	}

	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public void setTowingCapacity(double towingCapacity) {
		this.towingCapacity = towingCapacity;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public double getTowingCapacity() {
		return towingCapacity;
	}

	public void writeOutput() {
		super.writeOutput();
		System.out.println(
				"loadCapacity: " + loadCapacity + "  towingCapacity: " + towingCapacity+"\n");
	}

	@Override
	public boolean equals(Object otherObject) {
		if (!(otherObject != null && otherObject instanceof Truck))
			return false;
		Truck otherTruck = (Truck) otherObject;
		return this.loadCapacity == otherTruck.loadCapacity && this.towingCapacity == otherTruck.towingCapacity;
	}
}
