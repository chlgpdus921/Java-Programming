package myPackage;

public class Employee extends Person {
	private int ID;
	private String department;

	public Employee() {
		super();
		this.ID = 0;
		this.department = "";
	}

	public Employee(String initialName, int ID, String department) {
		super(initialName);
		this.ID = ID;
		this.department = department;
	}

	public int getID() {
		return this.ID;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void writeOutput() {
		super.writeOutput();
		System.out.println("ID : " + this.ID);
		System.out.println("DEPARTMENT : " + this.department);
	}
}

