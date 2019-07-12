package myPackage;

public class InvalidHourException extends InvalidTimeException{

	private static final long serialVersionUID = 1L;

	public InvalidHourException() {
		super("Hour is wrong");
	}

	public InvalidHourException(String t) {
		super(t);
	}
}
