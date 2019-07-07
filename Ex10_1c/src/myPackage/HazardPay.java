package myPackage;

public class HazardPay extends PayCalculator {

	HazardPay(double payrate) {
		this.payRate = payrate;
	}

	@Override
	public double computePay(double hours) {
		return 1.5 * super.computePay(hours);
	}

}
