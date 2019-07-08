package myPackage;

public class ShuffleCipher implements MessageEncoder {
	private int n;

	ShuffleCipher(int n) {
		this.n = n;
	}

	@Override
	public void encode(String plainText) {
		String result = "";
		for (int j = 0; j < n; j++) {
			int size = plainText.length() / 2;
			if (plainText.length() % 2 == 1)
				size++;
			result = "";
			for (int i = 0; i < plainText.length() / 2; i++) {
				result += (char) plainText.charAt(i) + "" + (char) plainText.charAt(size);
				size++;
			}
			if (plainText.length() % 2 == 1)
				result += (char) plainText.charAt(plainText.length() / 2);
			plainText = result;
		}
		System.out.println(result);
	}
}
