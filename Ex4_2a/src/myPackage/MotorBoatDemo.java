package myPackage;

public class MotorBoatDemo {
	public static void main(String[] args) {
		MotorBoat boat = new MotorBoat();
		boat.setMaxSpeed(120);
		boat.setCurrentSpeed(100);
		boat.setEfficiency(0.5);
		boat.setFuelAmount(50);
		
		System.out.println("CurrentSpeed: "+ boat.getCurrentSpeed());
		System.out.println("MaxSpeed: "+ 	boat.getMaxSpeed());
		System.out.println("Efficiency: "+ boat.getEfficiency());
		System.out.println("FuelAmount: "+ boat.getFuelAmount());
	
		boat.speed(3);
		boat.TimeTravelDistance(3);
		boat.AmountTravelDistance();

	}

}
