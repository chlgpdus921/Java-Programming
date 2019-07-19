package myPackage;

public class Ex12_1b {
	public static String getWordFromDigit(int digit) {
		String[] word = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		return word[digit];
	}

	public static void displayAsWords(int number) {
		String num = number + "";
		int temp = (int) Math.pow(10, num.length() - 1);
		for (int i = 0; i < num.length(); i++) {
			System.out.print(" " + getWordFromDigit(number / temp));
			number %= temp;
			temp /= 10;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		displayAsWords(987);
		displayAsWords(128);
		displayAsWords(4389);
	}
}
