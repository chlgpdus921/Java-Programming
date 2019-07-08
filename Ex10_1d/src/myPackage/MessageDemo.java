package myPackage;

public class MessageDemo {
	public static void main(String[] args) {
		ShuffleCipher shuffle = new ShuffleCipher(1);
		SubstitutionCipher sub = new SubstitutionCipher(3);
		ShuffleCipher shuffle2 = new ShuffleCipher(2);
		SubstitutionCipher sub2 = new SubstitutionCipher(5);

		shuffle.encode("abcdefghi");
		sub.encode("abcdefghi");
		shuffle2.encode("ABCDEFGHIZ");
		sub2.encode("ABCDFGHIZ");
	}

}
