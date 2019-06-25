package myPackage;

public class CharacteristicDemo {

	public static void main(String[] args) {
		Characteristic rating = new Characteristic("kind");
		Characteristic otherRating = new Characteristic("kind");
		rating.setRating();
		otherRating.setRating();
		System.out.println("descripition: " + rating.getDescription());
		System.out.println("rating: " + rating.getRating());
		System.out.println("descripition: " + otherRating.getDescription());
		System.out.println("rating: " + otherRating.getRating());
		System.out.println(rating.getCompataility(otherRating));
	}

}
