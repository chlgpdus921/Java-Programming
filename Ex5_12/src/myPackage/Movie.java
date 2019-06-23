package myPackage;

public class Movie {
	private String movieName;
	private String MPAArating;
	private int ratingTerrible = 0;
	private int ratingBad = 0;
	private int ratingOk = 0;
	private int ratingGood = 0;
	private int ratingGreat = 0;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMPAArating() {
		return MPAArating;
	}

	public void setMPAArating(String mPAArating) {
		MPAArating = mPAArating;
	}

	public void addRating(int num) {
		switch (num) {
		case 1:
			ratingTerrible++;
			break;
		case 2:
			ratingBad++;
			break;
		case 3:
			ratingOk++;
			break;
		case 4:
			ratingGood++;
			break;
		case 5:
			ratingGreat++;
			break;
		default:
			System.out.println("rating number is a number between 1 and 5");
			System.exit(0);
			break;
		}
	}

	public double getAverage() {
		int sum = ratingTerrible * 1 + ratingBad * 2 + ratingOk * 3 + ratingGood * 4 + ratingGreat * 5;
		return sum / 5.0;
	}

	public void print() {
		System.out.println("Movie Name: " + movieName);
		System.out.println("Movie MPAArating: " + MPAArating);
		System.out.println("Movie Average rating: " + getAverage()+"\n");
	}

	public boolean equals(Movie movie) {
		return (this.movieName.equals(movie.movieName) && this.MPAArating.equals(movie.MPAArating)
				&& this.ratingTerrible == movie.ratingTerrible && this.ratingBad == movie.ratingBad
				&& this.ratingOk == movie.ratingOk && this.ratingGood == movie.ratingGood
				&& this.ratingGreat == movie.ratingGreat);
	}

}
