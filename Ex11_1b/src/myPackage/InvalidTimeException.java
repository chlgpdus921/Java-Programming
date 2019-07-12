package myPackage;

public class InvalidTimeException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidTimeException() {
		super("Format is wrong");
	}

	public InvalidTimeException(String t) {
		super(t);
	}
}
