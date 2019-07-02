package myPackage;

public class Dog extends Pet {
	private String breed;
	private boolean boosterShot;
	
	Dog() {
		super();
		breed = "No name yet.";
		boosterShot = false;
	}
	Dog(String initialName, int initialAge, double initialWeight, String breed, boolean boosterShot) {
		super(initialName, initialAge, initialWeight);
		this.breed = breed;
		this.boosterShot = boosterShot;
	}
	
	public String getBreed() {
		return breed;
	}
	public boolean getBoosterShot() {
		return boosterShot;
	}
	public void writeOutput(){
		 super.writeOutput();
		 System.out.println("Breed: " + breed);
	        if(boosterShot)
	        	System.out.println("Have BoosterShot");
	        else
	        	System.out.println("Not have BoosterShot");
	}
	
}
