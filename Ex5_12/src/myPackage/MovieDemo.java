package myPackage;

public class MovieDemo {
	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Movie movie2 = new Movie();

		movie1.setMovieName("Home Alone");
		movie1.setMPAArating("G");
		movie1.addRating(5);
		movie1.addRating(4);
		movie1.addRating(3);
		movie1.addRating(5);
		movie1.addRating(5);
		movie1.print();

		movie2.setMovieName("Interstellar");
		movie2.setMPAArating("PG-13");
		movie2.addRating(3);
		movie2.addRating(2);
		movie2.addRating(4);
		movie2.addRating(2);
		movie2.addRating(5);
		movie2.print();

		System.out.print(movie1.equals(movie2) ? ("Same") : ("Different"));
	}
}
