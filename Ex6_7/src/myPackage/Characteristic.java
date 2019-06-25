package myPackage;

import java.util.Scanner;

public class Characteristic {
	private String description;
	private int rating;

	Characteristic(String description) {
		this.description = description;
		this.rating = 0;
	}

	private boolean isValid(int rating) {
		if ((rating > 0 && rating <= 10)) {
			return true;
		}
		return false;

	}

	public void setRating(int rating) {
		if (isValid(rating)) {
			this.rating = rating;
		} else
			System.out.println("rating is not valid");
	}

	public void setRating() {
		Scanner sc = new Scanner(System.in);
		rating = sc.nextInt();
		setRating(rating);
	}

	public String getDescription() {
		return description;
	}

	public int getRating() {
		return rating;
	}

	public double getCompataility(Characteristic otherRating) {
		if (isMatch(otherRating))
			return getCompatibilityMeasure(otherRating);
		else
			return 0;
	}

	private double getCompatibilityMeasure(Characteristic otherRating) {
		double m;
		if (rating == 0 || otherRating.rating == 0)
			m = 0;
		else{
			m = 1 - ((Math.pow((this.rating - otherRating.rating), 2)) / 81.0);
		}
		
		return m;

	}

	private boolean isMatch(Characteristic otherRating) {
		if (this.description.equals(otherRating.description))
			return true;
		return false;
	}
}
