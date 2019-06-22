package myPackage;

public class Grade {
	private int a, b, c, d, f;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public int totalGrade() {
		return a + b + c + d + f;
	}

	public int percentageA() {
		double result = (double) getA() / totalGrade() * 100;
		return (int) Math.ceil(result);
	}

	public int percentageB() {
		double result = (double) getB() / totalGrade() * 100;
		return (int) Math.ceil(result);
	}

	public int percentageC() {
		double result = (double) getC() / totalGrade() * 100;
		return (int) Math.ceil(result);
	}

	public int percentageD() {
		double result = (double) getD() / totalGrade() * 100;
		return (int) Math.ceil(result);
	}

	public int percentageF() {
		double result = (double) getF() / totalGrade() * 100;
		return (int) Math.ceil(result);
	}

	public void graphA() {
		for (int i = 0; i < percentageA() / 2; i++) {
			System.out.print("*");
		}
		System.out.println(" A");
	}

	public void graphB() {
		for (int i = 0; i < percentageB() / 2; i++) {
			System.out.print("*");
		}
		System.out.println(" B");
	}

	public void graphC() {
		for (int i = 0; i < percentageC() / 2; i++) {
			System.out.print("*");
		}
		System.out.println(" C");
	}

	public void graphD() {
		for (int i = 0; i < percentageD() / 2; i++) {
			System.out.print("*");
		}
		System.out.println(" D");
	}

	public void graphF() {
		for (int i = 0; i < percentageF() / 2; i++) {
			System.out.print("*");
		}
		System.out.println(" F");
	}

	public void format() {
		System.out.println("0   10   20   30   40   50   60   70   80   90  100%");
		System.out.println("|    |    |    |    |    |    |    |    |    |   |");
		for (int i = 0; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
