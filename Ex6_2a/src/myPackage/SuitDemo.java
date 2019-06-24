package myPackage;

public class SuitDemo {
	public static void main(String[] args) {
		Suit cardSuit = Suit.SPADES;//black
		System.out.println(cardSuit.ordinal());
		System.out.println(cardSuit.equals(Suit.CLUBS));
		System.out.println(cardSuit.compareTo(Suit.DIAMONDS));
		System.out.println(Suit.valueOf("DIAMONDS"));
		System.out.println(Suit.valueOf(cardSuit.toString()));
		System.out.println(cardSuit.getColor());
		System.out.println(cardSuit.toString());
	}
}
