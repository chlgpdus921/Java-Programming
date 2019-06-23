package myPackage;

public class MotorBoatDemo {
	public static void main(String[] args) {
		MotorBoat boat = new MotorBoat();
		MotorBoat boat2 = new MotorBoat();

		boat.setMaxSpeed(120);
		boat.setCurrentSpeed(100);
		boat.setEfficiency(0.5);
		boat.setFuelAmount(60);
		boat.speed(3);
		boat.TimeTravelDistance(3);
		boat.AmountTravelDistance();
		
		
		boat2.setMaxSpeed(180);
		boat2.setCurrentSpeed(100);
		boat2.setEfficiency(0.5);
		boat2.setFuelAmount(60);
		boat2.speed(3);
		boat2.TimeTravelDistance(3);
		boat2.AmountTravelDistance();
		
		System.out.println("< Boat 1> ");
		System.out.println("CurrentSpeed: " + boat.getCurrentSpeed());
		System.out.println("MaxSpeed: " + boat.getMaxSpeed());
		System.out.println("Efficiency: " + boat.getEfficiency());
		System.out.println("FuelAmount: " + boat.getFuelAmount());

		System.out.println("< Boat 2> ");
		System.out.println("CurrentSpeed: " + boat2.getCurrentSpeed());
		System.out.println("MaxSpeed: " + boat2.getMaxSpeed());
		System.out.println("Efficiency: " + boat2.getEfficiency());
		System.out.println("FuelAmount: " + boat2.getFuelAmount());
		
		
		if(boat.equals(boat2))
			System.out.println("Objects are same");
		else System.out.println("Objects are different.");

	}

}
