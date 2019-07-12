package myPackage;

public class InvalidMinuteException extends InvalidTimeException {

	private static final long serialVersionUID = 1L;

	public InvalidMinuteException() {
		super("Minute is wrong");
	}

	public InvalidMinuteException(String t) {
		super(t);
	}
}
