package myPackage;

public class Polynomial {

	private int degree;
	private double[] Coefficients = null;

	public void Polynomial(int max) {
		degree = max;
		Coefficients = new double[degree + 1];
		for (int i = 0; i < degree + 1; i++) {
			Coefficients[i] = 0;
		}

	}

	public void setConstant(int i, double value) {
		Coefficients[i] = value;

	}

	public double evaluate(int x) {
		int temp = 1;
		double sum = 0;
		for (int i = 0; i < Coefficients.length; i++) {
			for (int j = 0; j < i; j++) {
				temp = temp * x;
			}
			Coefficients[i] = Coefficients[i] * temp;
			temp = 1;
		}

		for (int i = 0; i < Coefficients.length; i++) {
			sum += Coefficients[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Polynomial a1 = new Polynomial();
		Polynomial a2 = new Polynomial();

		a1.Polynomial(3);
		a1.setConstant(0, 3);
		a1.setConstant(1, 5);
		a1.setConstant(2, 0);
		a1.setConstant(3, 2);
		System.out.println(a1.evaluate(2));

		a2.Polynomial(4);
		a2.setConstant(0, 5);
		a2.setConstant(1, 2);
		a2.setConstant(2, 3);
		a2.setConstant(3, 0);
		a2.setConstant(4, 2);
		System.out.println(a2.evaluate(2));
	}

}
