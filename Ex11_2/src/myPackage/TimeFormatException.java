package myPackage;

public class TimeFormatException extends Exception {
	private static final long serialVersionUID = 1L;

	public TimeFormatException() {
		super("There is no such time as");
	}

	public TimeFormatException(String message) {
		super(message);
	}

}