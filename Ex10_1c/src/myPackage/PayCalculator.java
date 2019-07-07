package myPackage;

public abstract class PayCalculator {
	public double payRate;

	public double computePay(double hours) {
		return payRate * hours;
	}
}
