package myPackage;

public class MotorBoat {
	private double maxSpeed, currentSpeed, fuelAmount, efficiency;
	public static final double tankCapacity = 60.0;

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(double currentSpeed) {
		if (currentSpeed > maxSpeed) {
			System.out.println("Error! currentSpeed is bigger than maxSpeed.");
		} else
			this.currentSpeed = currentSpeed;
	}

	public double getFuelAmount() {
		return fuelAmount;
	}

	public void setFuelAmount(double fuelAmount) {
		if (fuelAmount > tankCapacity) {
			System.out.println("Error! fuelAmount is bigger than tankCapacity.");
		} else
			this.fuelAmount = fuelAmount;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}

	public void speed(int t) {
		System.out.println("maximum speed: " + (efficiency * currentSpeed * currentSpeed * t));
		System.out.println("current speed: " + (efficiency * maxSpeed * maxSpeed * t));
	}

	public void TimeTravelDistance(int t) {
		System.out.println("current speed - travel distance : " + (currentSpeed * t));
		System.out.println("maximum speed - travel distance : " + (maxSpeed * t));
	}

	public void AmountTravelDistance() {
		System.out.println(
				"For current speeed is " + currentSpeed + " and fuel amount " + fuelAmount + ", travel distance: " + (fuelAmount / (efficiency * currentSpeed)));
	}
}
