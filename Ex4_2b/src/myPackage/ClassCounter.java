package myPackage;

public class ClassCounter {
	private int count;

	public int getCount() {
		return count;
	}

	public void reset() {
		count = 0;
	}

	public void increase() {
		count++;
	}

	public void decrease() {
		if (count <= 0) {
			System.out.println("count is a non-negative count");
		} else
			count--;
	}
}
