package myPackage;

public class SSNLengthException extends Exception {

	private static final long serialVersionUID = 1L;

	public SSNLengthException() {
		super("Error of SSN Length ");
	}

	public SSNLengthException(String message) {
		super(message);
	}

	public static boolean ValidLength(String SSN) {
		if (SSN.length() != 9) {
			return false;
		}
		return true;
	}

}