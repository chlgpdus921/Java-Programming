package myPackage;

public class PayDemo {

	public static void main(String[] args) {
	
		RegularPay regular = new RegularPay(20.6);
		RegularPay regular2 = new RegularPay(20.6);
		HazardPay hazard = new HazardPay(30.5);
		HazardPay hazard2 = new HazardPay(20.6);
		
		System.out.println(regular.computePay(3));
		System.out.println(regular2.computePay(1));
		System.out.println(hazard.computePay(3));
		System.out.println(hazard2.computePay(3));
	}

}
