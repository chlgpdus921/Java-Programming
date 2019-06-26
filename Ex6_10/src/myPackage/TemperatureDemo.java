package myPackage;

public class TemperatureDemo {
	public static void main(String[] args) {
		Temperature tem1 = new Temperature();
		Temperature tem2 = new Temperature(0);
		Temperature tem3 = new Temperature('C');
		Temperature tem4 = new Temperature(0, 'C');

		System.out.println("tem1 Fahrenheit:" + tem1.getFahrenheit() + "   tem1 Celsius: " + tem1.getCelsius());
		System.out.println("tem2 Fahrenheit:" + tem2.getFahrenheit() + "   tem2 Celsius: " + tem2.getCelsius());
		System.out.println("tem3 Fahrenheit:" + tem3.getFahrenheit() + "   tem3 Celsius: " + tem3.getCelsius());
		System.out.println("tem4 Fahrenheit:" + tem4.getFahrenheit() + "   tem4 Celsius: " + tem4.getCelsius());

		tem3.set(0.0, 'C');
		tem4.set(32.0, 'F');
		System.out.println(tem3.equal(tem4));
		tem3.set(-40.0, 'C');
		tem4.set(-40.0, 'F');
		System.out.println(tem3.isGreater(tem4));
		tem3.set(100.56);
		tem3.set('C');
		tem4.set(212.0);
		tem4.set('F');
		System.out.println(tem3.isLess(tem4));
	}

}
