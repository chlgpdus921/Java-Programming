package myPackage;

public class Vehicle {
	private String manufacturerName;
	private int cylinderNumber;
	private Person owner;

	Vehicle() {
		manufacturerName = "None";
		cylinderNumber = 0;
		owner.setName("None");
	}

	Vehicle(String manufacturerName, int cylinderNumber, Person owner) {
		this.manufacturerName = manufacturerName;
		this.cylinderNumber = cylinderNumber;
		this.owner = owner;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public int getCylinderNumber() {
		return cylinderNumber;
	}

	public Person getOwner() {
		return owner;
	}

	public void writeOutput() {
		System.out.println("manufacturerName: " + manufacturerName + "  cylinderNumber: " + cylinderNumber + "  owner: "
				+ owner.getName());
	}

	@Override
	public boolean equals(Object otherObject) {
		if (!(otherObject != null) && otherObject instanceof Vehicle)
			return false;
		Vehicle otherVehicle = (Vehicle) otherObject;
		return this.manufacturerName.equals(otherVehicle.manufacturerName)
				&& this.cylinderNumber == otherVehicle.cylinderNumber && this.owner.hasSameName(otherVehicle.owner);
	}
}
