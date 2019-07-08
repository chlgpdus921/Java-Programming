package myPackage;

public class SubstitutionCipher implements MessageEncoder {
	private int shift;

	SubstitutionCipher(int shift) {
		this.shift = shift;
	}

	@Override
	public void encode(String plainText) {
		String resultText = "";
		for (int i = 0; i < plainText.length(); i++) {
			char word = plainText.charAt(i);
			if (word >= 'a' && word <= 'z') {
				word += shift;
				if (word > 'z')
					word = (char) ('a' - 1 + word - 'z');
			} else if (word >= 'A' && word <= 'Z') {
				word += shift;
				if (word > 'Z')
					word = (char) ('A' - 1 + word - 'Z');
			}
			resultText += word;
		}
		System.out.println(resultText);
	}
}
