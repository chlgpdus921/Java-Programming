package myPackage;

public enum Suit {
	CLUBS("black"), DIAMONDS("red"), HEARTS("red"), SPADES("black");

	private final String color;// instance variable

	private Suit(String suitColor) {
		color = suitColor;
	}

	public String getColor() {
		return color;
	}
}
