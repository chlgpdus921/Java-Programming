package myPackage;

public class DoctorDemo {

	public static void main(String[] args) {
		Doctor d = new Doctor();
		Doctor f = new Doctor("Choi", Specialty.Surgery, 99.9);
		Doctor k = new Doctor("An", Specialty.Dentist, 49.9);
		d.setName("Choi");
		d.setSpecialty(Specialty.Surgery);
		d.setVisit_fee(99.9);
		System.out.println(d.toString());
		System.out.println(k.toString());
		System.out.println(d.equals(f));
		System.out.println(d.equals(k));
	}

}
