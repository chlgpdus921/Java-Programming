package myPackage;

public class Doctor extends Person {
	private double visit_fee;
	private Specialty specialty;

	Doctor() {
		super();
	}

	Doctor(String name, Specialty specialty, double fee) {
		super(name);
		setSpecialty(specialty);
		setVisit_fee(fee);
	}

	public void setSpecialty(Specialty specialty) {
		if (specialty.equals(Specialty.Dentist) || specialty.equals(Specialty.Medicine)
				|| specialty.equals(Specialty.Oriental) || specialty.equals(Specialty.Surgery)) {
			this.specialty = specialty;
		}
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setVisit_fee(double visit_fee) {
		this.visit_fee = visit_fee;
	}

	public double getVisit_fee() {
		return visit_fee;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + "\nSpecialty: " + getSpecialty() + "\nVisit Fee: " + getVisit_fee() + "\n";
	}

	@Override
	public boolean equals(Object otherObject) {
		if (!(otherObject != null && otherObject instanceof Doctor))
			return false;
		Doctor otherDoctor = (Doctor) otherObject;
		return this.hasSameName(otherDoctor) && (this.visit_fee == otherDoctor.visit_fee)
				&& (this.specialty.equals(otherDoctor.specialty));
	}
}
