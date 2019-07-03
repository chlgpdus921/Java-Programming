package myPackage;

public class Faculty extends Employee {
	private String membersTitle;

	public Faculty() {
		super();
		this.membersTitle = "";
	}

	public Faculty(String initialName, int ID, String department,
			String membersTitle) {
		super(initialName, ID, department);
		this.membersTitle = membersTitle;
	}

	public String getMembersTitle() {
		return this.membersTitle;
	}

	public void setMembersTitle(String membersTitle) {
		this.membersTitle = membersTitle;
	}

	public void writeOutput() {
		super.writeOutput();
		System.out.println("MEMBERS TITLE : " + this.membersTitle);
	}
}
