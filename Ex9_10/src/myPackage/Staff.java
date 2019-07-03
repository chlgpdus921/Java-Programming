package myPackage;

public class Staff extends Employee {
	private int payGrade;

	public Staff() {
		super();
		this.payGrade = 0;
	}

	public Staff(String initialName, int ID, String department, int payGrade) {
		super(initialName, ID, department);
		this.payGrade = payGrade;
	}

	public int getPayGrade() {
		return this.payGrade;
	}

	public void setMembersTitle(int payGrade) {
		this.payGrade = payGrade;
	}

	public void writeOutput() {
		super.writeOutput();
		System.out.println("PAYGRADE : " + this.payGrade);
	}
}