package myPackage;

public class MotorBoatDemo {
	public static void main(String[] args) {
		MotorBoat boat = new MotorBoat();
		boat.c = 1000; // Capacity of fuel tank
		boat.f = 500; // Amount of fuel in the tank
		boat.m = 180; // Maximum speed
		boat.s = 60; // Current speed
		boat.e = 0.5;// Efficiency of the boat¡¯s motor

		boat.speed(3); //set time = 3
		boat.TimeTravelDistance(3);
		boat.AmountTravelDistance();

	}

}
