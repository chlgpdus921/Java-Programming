package myPackage;

public class MotorBoat {
	public double c, m, s, f, e;

	public void speed(int t) {
		System.out.println("maximum speed: " + (e * s * s * t));
		System.out.println("current speed: " + (e * m * m * t));
	}

	public void TimeTravelDistance(int t) {
		System.out.println("current "
				+ "speed - travel distance : " + (s * t));
		System.out.println("maximum speed - travel distance : " + (m * t));
	}

	public void AmountTravelDistance() {
		System.out.println("For current speeed is " + s + 
				" and fuel amount " + f + ", travel distance: " + (f / (e * s)));
	}
}
