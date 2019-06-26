package myPackage;
public class Temperature {
	private double degree;
	private char scale;

	Temperature(double degree) {
		this.degree = degree;
	}

	Temperature(char scale) {
		this.scale = scale;
	}

	Temperature(double degree, char scale) {
		this.degree = degree;
		this.scale = scale;
	}

	Temperature() {
		this.degree = 0;
		this.scale = 'C';
	}

	public double getCelsius() {
		if (scale == 'F')
			return Math.round((5 * (degree - 32) / 9)*10)/10;
		return degree;
	}

	public double getFahrenheit() {
		if (scale == 'C')
			return Math.round((9 * (degree) / 5 + 32)*10)/10;
		return degree;
	}

	public void set(double degree) {
		this.degree = degree;
	}

	public void set(char scale) {
		this.scale = scale;
	}

	public void set(double degree, char scale) {
		this.degree = degree;
		this.scale = scale;
	}

	public boolean equal(Temperature temperature) {
		return this.getCelsius() == temperature.getCelsius();
	}

	public boolean isGreater(Temperature tem2) {
		if (this.getCelsius() > tem2.getCelsius())
			return true;

		else
			return false;
	}

	public boolean isLess(Temperature tem2) {
		if (this.getCelsius() < tem2.getCelsius())
			return true;
		else
			return false;
	}
}

